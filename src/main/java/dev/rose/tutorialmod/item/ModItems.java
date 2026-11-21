package dev.rose.tutorialmod.item;


import dev.rose.tutorialmod.TutorialModX261;
import dev.rose.tutorialmod.item.food.ModFoodComponent;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import java.util.function.Function;

public class ModItems {

    public static final Item METH = register(ModItemIds.METH, Item::new, new Item.Properties()
            .food(ModFoodComponent.METH_FOOD_COMPONENT, ModFoodComponent.METH_FOOD_CONSUMABLE_COMPONENT));

    public static final Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings ) {

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


