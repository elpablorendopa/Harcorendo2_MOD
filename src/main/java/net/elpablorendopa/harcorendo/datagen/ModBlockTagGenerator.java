package net.elpablorendopa.harcorendo.datagen;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.block.ModBlocks;
import net.elpablorendopa.harcorendo.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HarcorendoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //bloques lisos
        this.tag(ModTags.Blocks.BLOCKSLISOS)
                .add(
                        ModBlocks.COBRELISO.get(),
                        ModBlocks.HIERROLISO.get(),
                        ModBlocks.HIERRORECOCIDOBLOCK.get()

                        );

        //min diamond tool
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(
                        ModBlocks.COBRELISO.get(),
                        ModBlocks.COBRERECOCIDOBLOCK.get(),
                        ModBlocks.HIERROLISO.get(),
                        ModBlocks.HIERRORECOCIDOBLOCK.get(),
                        ModBlocks.SUPERBLOCK.get()

                );

        //req pickaxe
        this.tag((BlockTags.MINEABLE_WITH_PICKAXE))
                .add(
                        ModBlocks.COBRELISO.get(),
                        ModBlocks.COBRERECOCIDOBLOCK.get(),
                        ModBlocks.HIERROLISO.get(),
                        ModBlocks.HIERRORECOCIDOBLOCK.get(),
                        ModBlocks.BANABLOCK.get(),
                        ModBlocks.SUPERBLOCK.get()

                );
    }
}
