package net.crackdully.orespawnreloaded.item;

import net.crackdully.orespawnreloaded.OrespawnReloaded;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OrespawnReloaded.MOD_ID);

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBYCHESTPLATE = ITEMS.register("rubychestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIGHAMMER = ITEMS.register("bighammer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACID = ITEMS.register("acid",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYSTBOOTS = ITEMS.register("amethystboots",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYSTCHESTPLATE = ITEMS.register("amethystchestplate",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
