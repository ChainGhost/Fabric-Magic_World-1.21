package com.chain_ghost.magic_world.item;

import com.chain_ghost.magic_world.MagicWorld;
import com.chain_ghost.magic_world.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BUILDING_BLOCKS = Registry.register(Registries.ITEM_GROUP, Identifier.of(MagicWorld.MOD_ID, "building_blocks"),
            ItemGroup.create(ItemGroup.Row.TOP, 1).displayName(Text.translatable("itemGroups.magic_world.building_blocks"))
                    .icon(()-> new ItemStack(ModBlocks.COAL_CORE))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.COAL_CORE);
                        entries.add(ModBlocks.COPPER_CORE);
                        entries.add(ModBlocks.IRON_CORE);
                        entries.add(ModBlocks.GOLD_CORE);
                        entries.add(ModBlocks.REDSTONE_CORE);
                        entries.add(ModBlocks.LAPIS_CORE);
                        entries.add(ModBlocks.EMERALD_CORE);
                        entries.add(ModBlocks.DIAMOND_CORE);
                        entries.add(ModBlocks.NETHERITE_CORE);
                    })).build());
    public static final ItemGroup SPECIAL_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(MagicWorld.MOD_ID, "special_items"),
            ItemGroup.create(ItemGroup.Row.TOP, 2).displayName(Text.translatable("itemGroups.magic_world.special_items"))
                    .icon(()-> new ItemStack(ModItems.COAL_KEY))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.COAL_KEY);
                        entries.add(ModItems.COPPER_KEY);
                        entries.add(ModItems.IRON_KEY);
                        entries.add(ModItems.GOLD_KEY);
                        entries.add(ModItems.REDSTONE_KEY);
                        entries.add(ModItems.LAPIS_KEY);
                        entries.add(ModItems.EMERALD_KEY);
                        entries.add(ModItems.DIAMOND_KEY);
                        entries.add(ModItems.NETHERITE_KEY);
                    })).build());
    public static void registerModItemGroups() {
        MagicWorld.LOGGER.info("Registering Item Groups");
    }
}
