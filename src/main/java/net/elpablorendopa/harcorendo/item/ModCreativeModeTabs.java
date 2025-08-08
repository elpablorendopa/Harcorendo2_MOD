package net.elpablorendopa.harcorendo.item;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HarcorendoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HARCORENDOITEMSTAB = CREATIVE_MODE_TABS.register("harcorendo_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.TEKEN.get()))
                    .title(Component.translatable("creativetab.harcorendo.teken_items"))
                    .displayItems((pParameters, pOutput) -> {

                        //Items
                        //Items

                        pOutput.accept(Moditems.TEKEN.get());
                        pOutput.accept(Moditems.REDTEKEN.get());
                        pOutput.accept(Moditems.PLATO.get());
                        pOutput.accept(Moditems.PLATORESURECCION.get());
                        pOutput.accept(Moditems.VOIDTEMPLATE.get());
                        pOutput.accept(Moditems.ACERODENSOINGOT.get());
                        pOutput.accept(Moditems.CORE.get());
                        pOutput.accept(Moditems.ACEROTEMPLATE.get());
                        pOutput.accept(Moditems.COBRERECOCIDO.get());
                        pOutput.accept(Moditems.HIERRORECOCIDO.get());
                        pOutput.accept(Moditems.BATALA.get());
                        pOutput.accept(Moditems.COOKIETOTEM.get());
                        pOutput.accept(Moditems.CHISEL.get());
                        pOutput.accept(Moditems.SOUL.get());
                        pOutput.accept(Moditems.CARMESISWORD.get());
                        pOutput.accept(Moditems.CARMESIPICKAXE.get());


                        //Blocks
                        //Blocks

                        pOutput.accept(ModBlocks.ACERODENSOBLOCK.get());
                        pOutput.accept(ModBlocks.COBRERECOCIDOBLOCK.get());
                        pOutput.accept(ModBlocks.HIERRORECOCIDOBLOCK.get());
                        pOutput.accept(ModBlocks.HIERROLISO.get());
                        pOutput.accept(ModBlocks.COBRELISO.get());
                        pOutput.accept(ModBlocks.TRANSFORMER.get());
                        pOutput.accept(ModBlocks.BANABLOCK.get());
                        pOutput.accept(ModBlocks.SUPERBLOCK.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
