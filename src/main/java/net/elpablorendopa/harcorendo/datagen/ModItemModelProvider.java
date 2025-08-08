package net.elpablorendopa.harcorendo.datagen;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.item.Moditems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HarcorendoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(Moditems.ACERODENSOINGOT);
        simpleItem(Moditems.ACEROTEMPLATE);
        simpleItem(Moditems.BATALA);
        simpleItem(Moditems.CHISEL);
        simpleItem(Moditems.COBRERECOCIDO);
        simpleItem(Moditems.COOKIETOTEM);
        simpleItem(Moditems.CORE);
        simpleItem(Moditems.HIERRORECOCIDO);
        simpleItem(Moditems.PLATO);
        simpleItem(Moditems.PLATORESURECCION);
        simpleItem(Moditems.VOIDTEMPLATE);
        simpleItem(Moditems.SOUL);
        handheldItem(Moditems.CARMESISWORD);
        handheldItem(Moditems.CARMESIPICKAXE);

    }

    //methods

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HarcorendoMod.MOD_ID,"item/" + item.getId().getPath()));
        }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(HarcorendoMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
