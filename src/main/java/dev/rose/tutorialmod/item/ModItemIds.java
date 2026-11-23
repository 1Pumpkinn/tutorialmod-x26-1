package dev.rose.tutorialmod.item;

import dev.rose.tutorialmod.TutorialModX261;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ModItemIds {

    public static final ResourceKey<Item> METH = create("meth");
    public static final ResourceKey<Item> BONE_MARROW = create("bone_marrow");


    public static ResourceKey<Item> create(String name) {

        // Creates the Item Key
        return ResourceKey.create(Registries.ITEM, TutorialModX261.id(name));
    }

}
