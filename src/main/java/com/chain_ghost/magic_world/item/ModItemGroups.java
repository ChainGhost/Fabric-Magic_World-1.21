package com.chain_ghost.magic_world.item;

import com.chain_ghost.magic_world.MagicWorld;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SPECIAL_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(MagicWorld.MOD_ID, "special_items"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroups.magic_world.special_items"))
                    .icon(()-> new ItemStack(ModItems.COAL_KEY))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.COAL_KEY);
                        entries.add(ModItems.COPPER_KEY);
                        entries.add(ModItems.IRON_KEY);
                        entries.add(ModItems.GOLD_KEY);
                        entries.add(ModItems.REDSTONE_KEY);
                        entries.add(ModItems.LAPIS_LAZULI_KEY);
                        entries.add(ModItems.EMERALD_KEY);
                        entries.add(ModItems.DIAMOND_KEY);
                        entries.add(ModItems.NETHERITE_KEY);
                    })).build());
    public static void registerModItemGroups() {
        MagicWorld.LOGGER.info("Registering Item Groups");
    }
}
