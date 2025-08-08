package net.elpablorendopa.harcorendo.util;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BLOCKSLISOS = createTag("blocks_lisos");
        public static final TagKey<Block> NEEDS_CARMESI_TOOL = createTag("needs_carmesi_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(HarcorendoMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TEKENTRADE = createTag("teken_trade");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HarcorendoMod.MOD_ID, name));
        }
    }


}
