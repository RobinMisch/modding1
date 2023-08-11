package net.crackdully.orespawnreloaded.item;

import net.crackdully.orespawnreloaded.OrespawnReloaded;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrespawnReloaded.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ORESPAWNRELOADED_TAB = CREATIVE_MODE_TABS.register("orespawn_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST.get()))
                    .title(Component.translatable("creativetab.orespawn_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AMETHYST.get());
                        pOutput.accept(ModItems.BIGHAMMER.get());
                        pOutput.accept(ModItems.PIZZA.get());
                        pOutput.accept(ModItems.RUBYCHESTPLATE.get());
                        pOutput.accept(ModItems.ACID.get());
                        pOutput.accept(ModItems.AMETHYSTBOOTS.get());
                        pOutput.accept(ModItems.AMETHYSTCHESTPLATE.get());
                        pOutput.accept(ModItems.AMETHYSTHELMET.get());
                        pOutput.accept(ModItems.AMETHYSTLEGGINGS.get());
                        pOutput.accept(ModItems.AMETHYSTAXE.get());
                        pOutput.accept(ModItems.AMETHYSTHOE.get());
                        pOutput.accept(ModItems.AMETHYSTPICKAXE.get());
                        pOutput.accept(ModItems.AMETHYSTSHOVEL.get());
                        pOutput.accept(ModItems.AMETHYSTSWORD.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
