package dev.rose.tutorialmod.item.potion;


import dev.rose.tutorialmod.TutorialModX261;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotionsIds {

    public static final ResourceKey<Potion> TATER_POTION = create("tater");


    private static ResourceKey<Potion> create(String name) {
        Identifier id = TutorialModX261.id(name);
        return ResourceKey.create(Registries.POTION, id);    }

}
