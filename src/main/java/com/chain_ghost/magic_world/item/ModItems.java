package com.chain_ghost.magic_world.item;

import com.chain_ghost.magic_world.MagicWorld;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item COAL_KEY = registerItems("coal_key", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1)));
    public static final Item COPPER_KEY = registerItems("copper_key", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1)));
    public static final Item IRON_KEY = registerItems("iron_key", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1)));
    public static final Item GOLD_KEY = registerItems("gold_key", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1)));
    public static final Item REDSTONE_KEY = registerItems("redstone_key", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1)));
    public static final Item LAPIS_LAZULI_KEY = registerItems("lapis_lazuli_key", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1)));
    public static final Item EMERALD_KEY = registerItems("emerald_key", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item DIAMOND_KEY = registerItems("diamond_key", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    public static final Item NETHERITE_KEY = registerItems("netherite_key", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)));
    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MagicWorld.MOD_ID, id), item);
    }
    public static void registerModItems(){
        MagicWorld.LOGGER.info("Registering Items");
    }
}
