package com.chain_ghost.magic_world.block;

import com.chain_ghost.magic_world.MagicWorld;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COAL_CORE = register("coal_core", new Block(AbstractBlock.Settings.create().strength(3.0f, 5.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block COPPER_CORE = register("copper_core", new Block(AbstractBlock.Settings.create().strength(4.0f, 6.5f).sounds(BlockSoundGroup.COPPER)));
    public static final Block IRON_CORE = register("iron_core", new Block(AbstractBlock.Settings.create().strength(6.5f, 8.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block GOLD_CORE = register("gold_core", new Block(AbstractBlock.Settings.create().strength(2.0f, 3.5f).sounds(BlockSoundGroup.METAL)));
    public static final Block REDSTONE_CORE = register("redstone_core", new Block(AbstractBlock.Settings.create().strength(4.5f, 7.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block LAPIS_CORE = register("lapis_core", new Block(AbstractBlock.Settings.create().strength(3.5f, 5.5f).sounds(BlockSoundGroup.STONE)));
    public static final Block EMERALD_CORE = register("emerald_core", new Block(AbstractBlock.Settings.create().strength(6.5f, 8.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block DIAMOND_CORE = register("diamond_core", new Block(AbstractBlock.Settings.create().strength(7.0f, 9.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block NETHERITE_CORE = register("netherite_core", new Block(AbstractBlock.Settings.create().strength(10.0f, 50.0f).sounds(BlockSoundGroup.NETHERITE)));
    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MagicWorld.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MagicWorld.MOD_ID, id), block);
    }
    public static void registerModBlocks() {
        MagicWorld.LOGGER.info("Registering Blocks");
    }
}
