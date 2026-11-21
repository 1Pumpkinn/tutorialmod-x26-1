package dev.rose.tutorialmod.item;

import dev.rose.tutorialmod.TutorialModX261;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {



    public static final CreativeModeTab TUTORIALMOD_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.METH))
            .title(Component.translatable("creativetab.tutorialmod"))
            .displayItems((params, output) -> {
                output.accept(ModItems.METH);
            }).build();

    public static final ResourceKey<CreativeModeTab> TUTORIALMOD_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), TutorialModX261.id("creative_tab"));
}
