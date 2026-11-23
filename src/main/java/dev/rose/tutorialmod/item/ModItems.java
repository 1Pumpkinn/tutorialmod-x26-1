package dev.rose.tutorialmod.item;


import dev.rose.tutorialmod.TutorialModX261;
import dev.rose.tutorialmod.item.food.ModFoodComponent;
import dev.rose.tutorialmod.item.potion.ModPotionsIds;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.component.Compostable;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.function.Function;

public class ModItems {

    public static final Item METH = register(ModItemIds.METH, Item::new, new Item.Properties()
            .food(ModFoodComponent.METH_FOOD_COMPONENT, ModFoodComponent.METH_FOOD_CONSUMABLE_COMPONENT));
    public static final Item BONE_MARROW = register(ModItemIds.BONE_MARROW, Item::new, new Item.Properties().compostable(ContextIntProviders.COMPOSTABLE_ALWAYS_ADD_ONE));

    public static final Holder<Potion> TATER_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    ModPotionsIds.TATER_POTION,
                    new Potion("tater",
                            new MobEffectInstance(
                                    TutorialModX261.TATER,
                                    3600,
                                    0)));


    public static final Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings ) {


        DefaultItemComponentEvents.MODIFY.register(modifyContext -> {
            modifyContext.modify(ModItems.BONE_MARROW, (builder, provider, item) -> builder.set(DataComponents.COMPOSTABLE,
                    new Compostable(ContextIntProviders.COMPOSTABLE_ALWAYS_ADD_ONE)));
        });

        // Creates the item instance
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Registers the Item
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ModCreativeTab.TUTORIALMOD_CREATIVE_TAB_KEY, ModCreativeTab.TUTORIALMOD_CREATIVE_TAB);
        TutorialModX261.LOGGER.info("Registering ModItems for " + TutorialModX261.MOD_ID);
    }
}


