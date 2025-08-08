package net.elpablorendopa.harcorendo.block;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.block.custom.BanaBlock;
import net.elpablorendopa.harcorendo.block.custom.MagicBlock;
import net.elpablorendopa.harcorendo.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HarcorendoMod.MOD_ID);

    public static final RegistryObject<Block> ACERODENSOBLOCK = BLOCKS.register("acero_denso_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(-1f, 8.0f)
                    .sound(SoundType.BONE_BLOCK)
                    .pushReaction(PushReaction.IGNORE)
            ));

    public static final RegistryObject<Block> COBRERECOCIDOBLOCK = BLOCKS.register("cobre_recocido_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(100.0f, 4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> HIERRORECOCIDOBLOCK = BLOCKS.register("hierro_recocido_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(600.0f, 4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> HIERROLISO = BLOCKS.register("hierro_liso",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(600.0f, 4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> COBRELISO = BLOCKS.register("cobre_liso",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(100.0f, 4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> TRANSFORMER = BLOCKS.register("transformer_block",
            () -> new MagicBlock(BlockBehaviour.Properties.of()
                    .strength(-1f, -1f)
                    .noLootTable()
            ));

    public static final RegistryObject<Block> BANABLOCK = BLOCKS.register("bana_block",
            () -> new BanaBlock(BlockBehaviour.Properties.of()
                    .strength(0.1f, 0.1f)
            ));

    public static final RegistryObject<Block> SUPERBLOCK = BLOCKS.register("super_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(10f, 10f)
            ));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
