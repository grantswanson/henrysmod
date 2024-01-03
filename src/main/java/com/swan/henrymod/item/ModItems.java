package com.swan.henrymod.item;

import com.swan.henrymod.HenryMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HenryMod.MOD_ID);

    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",
            () -> new Item(new Item.Properties().food(Foods.ACORN)));

    public static final RegistryObject<Item> ROOTS_ITEM = ITEMS.register("roots_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
