package net.elpablorendopa.harcorendo.datagen.loot;

import net.elpablorendopa.harcorendo.block.ModBlocks;
import net.elpablorendopa.harcorendo.item.Moditems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //only same item
        this.dropSelf(ModBlocks.COBRERECOCIDOBLOCK.get());
        this.dropSelf(ModBlocks.COBRELISO.get());
        this.dropSelf(ModBlocks.HIERRORECOCIDOBLOCK.get());
        this.dropSelf(ModBlocks.HIERROLISO.get());
        this.dropSelf(ModBlocks.BANABLOCK.get());
        this.dropSelf(ModBlocks.SUPERBLOCK.get());

        //other drops
        this.add(ModBlocks.ACERODENSOBLOCK.get(),
                block -> customOreDrop(ModBlocks.ACERODENSOBLOCK.get(), Moditems.ACERODENSOINGOT.get(),1f,4f));

        //other drops with fortune
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder customOreDrop(Block pBlock, Item pItem, Float minDrop, Float maxDrop) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)))
                ));
    }

    protected LootTable.Builder customOreDropFortune(Block pBlock, Item pItem, Float minDrop, Float maxDrop) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrop, maxDrop)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                ));
    }
}
