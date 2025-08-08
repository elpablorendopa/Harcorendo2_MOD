package net.elpablorendopa.harcorendo.block.custom;

import net.elpablorendopa.harcorendo.item.Moditems;
import net.elpablorendopa.harcorendo.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class MagicBlock extends Block {
    public MagicBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pEntity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == Moditems.PLATORESURECCION.get() ) {
                itemEntity.setItem(new ItemStack(Moditems.SOUL.get(), itemEntity.getItem().getCount()));
                itemEntity.playSound(SoundEvents.GENERIC_EXPLODE, 2f, 1f);
            }

            if(itemEntity.getItem().getItem() == Moditems.ACERODENSOINGOT.get()) {
                itemEntity.setItem(new ItemStack(Moditems.HIERRORECOCIDO.get(), 5));
                itemEntity.playSound(SoundEvents.GENERIC_EXPLODE, 2f, 1f);
            }

            if(itemEntity.getItem().getItem() == Moditems.REDTEKEN.get()) {
                itemEntity.setItem(new ItemStack(Moditems.TEKEN.get(), 8));
                itemEntity.playSound(SoundEvents.GENERIC_EXPLODE, 2f, 1f);
            }

            if(isValidItem(itemEntity.getItem())) {
                itemEntity.setItem(new ItemStack(Moditems.TEKEN.get(), itemEntity.getItem().getCount()));
                itemEntity.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 2f, 1f);
            }
        }

        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    private boolean isValidItem(ItemStack item) {
        return item.is(ModTags.Items.TEKENTRADE);
    }
}
