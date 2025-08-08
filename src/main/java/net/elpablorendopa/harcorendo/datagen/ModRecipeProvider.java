package net.elpablorendopa.harcorendo.datagen;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.block.ModBlocks;
import net.elpablorendopa.harcorendo.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.function.Consumer;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final  List<ItemLike> COPPER_INGOTS = List.of(Items.COPPER_INGOT);
    private static final  List<ItemLike> IRON_INGOTS = List.of(Items.IRON_INGOT);

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //blasting
        oreBlastingCustom(pWriter, COPPER_INGOTS, Moditems.COBRERECOCIDO.get(), 0.5f, 500, "cobre_recocido");
        oreBlastingCustom(pWriter, IRON_INGOTS, Moditems.COBRERECOCIDO.get(), 0.5f, 500, "cobre_recocido");

        //smelting

        //shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBRERECOCIDOBLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Moditems.COBRERECOCIDO.get())
                .unlockedBy(getHasName(Moditems.COBRERECOCIDO.get()), has(Moditems.COBRERECOCIDO.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HIERRORECOCIDOBLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Moditems.HIERRORECOCIDO.get())
                .unlockedBy(getHasName(Moditems.HIERRORECOCIDO.get()), has(Moditems.HIERRORECOCIDO.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACERODENSOBLOCK.get())
                .pattern("##")
                .pattern("##")
                .define('#', Moditems.ACERODENSOINGOT.get())
                .unlockedBy(getHasName(Moditems.ACERODENSOINGOT.get()), has(Moditems.ACERODENSOINGOT.get()))
                .save(pWriter);


        //shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.COBRERECOCIDO.get(), 9)
                .requires(ModBlocks.COBRERECOCIDOBLOCK.get())
                .unlockedBy(getHasName(ModBlocks.COBRERECOCIDOBLOCK.get()), has(ModBlocks.COBRERECOCIDOBLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.HIERRORECOCIDO.get(), 9)
                .requires(ModBlocks.HIERRORECOCIDOBLOCK.get())
                .unlockedBy(getHasName(ModBlocks.HIERRORECOCIDOBLOCK.get()), has(ModBlocks.HIERRORECOCIDOBLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.ACERODENSOINGOT.get(), 4)
                .requires(ModBlocks.ACERODENSOBLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ACERODENSOBLOCK.get()), has(ModBlocks.ACERODENSOBLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.SUPERBLOCK.get(), 1)
                .requires(ModBlocks.COBRELISO.get())
                .requires(ModBlocks.HIERROLISO.get())
                .requires(ModBlocks.ACERODENSOBLOCK.get())
                .requires(Blocks.IRON_BLOCK)
                .requires(Blocks.NETHERITE_BLOCK)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Blocks.DARK_PRISMARINE)
                .requires(Blocks.DIAMOND_BLOCK)
                .requires(Blocks.GOLD_BLOCK)
                .unlockedBy(getHasName(ModBlocks.COBRERECOCIDOBLOCK.get()), has(ModBlocks.COBRERECOCIDOBLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmeltingCustom(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE
                , pIngredients, RecipeCategory.MISC, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlastingCustom(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE
                , pIngredients, RecipeCategory.MISC, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCookingCustom(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike),
                    pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, HarcorendoMod.MOD_ID+ ":" +getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
