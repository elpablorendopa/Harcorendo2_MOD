package net.elpablorendopa.harcorendo.datagen;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HarcorendoMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.COBRERECOCIDOBLOCK);
        blockWithItem(ModBlocks.COBRELISO);
        blockWithItem(ModBlocks.HIERRORECOCIDOBLOCK);
        blockWithItem(ModBlocks.HIERROLISO);
        blockWithItem(ModBlocks.ACERODENSOBLOCK);
        blockWithItem(ModBlocks.TRANSFORMER);
        blockWithItem(ModBlocks.BANABLOCK);
        blockWithItem(ModBlocks.SUPERBLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
