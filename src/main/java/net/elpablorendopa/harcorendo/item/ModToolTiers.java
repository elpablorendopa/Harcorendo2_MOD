package net.elpablorendopa.harcorendo.item;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.elpablorendopa.harcorendo.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier CARMESI = TierSortingRegistry.registerTier(
            new ForgeTier(5,2031,12.0f, 4.0f, 15,
                    ModTags.Blocks.NEEDS_CARMESI_TOOL, () -> Ingredient.of(Moditems.ACERODENSOINGOT.get())),
            new ResourceLocation(HarcorendoMod.MOD_ID, "carmesi"), List.of(Tiers.NETHERITE),  List.of());
}
