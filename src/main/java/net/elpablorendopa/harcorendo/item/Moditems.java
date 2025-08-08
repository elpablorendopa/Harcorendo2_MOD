package net.elpablorendopa.harcorendo.item;

import net.elpablorendopa.harcorendo.HarcorendoMod;
import net.elpablorendopa.harcorendo.block.ModBlocks;
import net.elpablorendopa.harcorendo.item.custom.ChiselItem;
import net.minecraft.advancements.critereon.UsedTotemTrigger;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Moditems {

    //items
    //items
    //items
    //items

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HarcorendoMod.MOD_ID);

    public static final RegistryObject<Item> TEKEN = ITEMS.register("teken",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.teken"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> PLATO = ITEMS.register("plato",
            ()  -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATORESURECCION = ITEMS.register("plato_de_resureccion",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.plato_de_resureccion"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> CORE = ITEMS.register("core",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)
                    .fireResistant()
                    .stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.core"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> REDTEKEN = ITEMS.register("red_teken",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.RARE)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.red_teken"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> VOIDTEMPLATE = ITEMS.register("void_template",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(16)));

    public static final RegistryObject<Item> ACEROTEMPLATE = ITEMS.register("acero_template",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
                    .stacksTo(16)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.acero_template"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });


    public static final RegistryObject<Item> ACERODENSOINGOT = ITEMS.register("acero_denso_ingot",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(16)
                    .fireResistant()));


    public static final RegistryObject<Item> COBRERECOCIDO = ITEMS.register("cobre_recocido",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(64)));

    public static final RegistryObject<Item> HIERRORECOCIDO = ITEMS.register("hierro_recocido",
            ()  -> new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(64)));

    public static final RegistryObject<Item> BATALA = ITEMS.register("bat_ala",
            ()  -> new Item(new Item.Properties()
                    .stacksTo(64)));

    public static final RegistryObject<Item> COOKIETOTEM = ITEMS.register("cookie_totem",
            ()  -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.RARE)
                    .food(ModFoodProperties.COOKIETOTEM)) {
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.cookie_totem"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .durability(8)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.chisel"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> SOUL = ITEMS.register("soul",
            () -> new Item(new Item.Properties()
                    .durability(1)
                    .rarity(Rarity.RARE)
                    .food(ModFoodProperties.SOULFOOD)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.soul"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> CARMESISWORD = ITEMS.register("carmesi_sword",
            () -> new SwordItem(ModToolTiers.CARMESI, 4, -2.4f , new Item.Properties()
                    .rarity(Rarity.EPIC)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.carmesi_sword"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

    public static final RegistryObject<Item> CARMESIPICKAXE = ITEMS.register("carmesi_picaxe",
            () -> new PickaxeItem(ModToolTiers.CARMESI, 3, -2.8f , new Item.Properties()
                    .rarity(Rarity.EPIC)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.harcorendo.carmesi_picaxe"));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });


    //blocks
    //blocks
    //blocks
    //blocks

    public static final RegistryObject<Item> ACERODENSOBLOCK = ITEMS.register("acero_denso_block",
            () -> new BlockItem(ModBlocks.ACERODENSOBLOCK.get(), new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .fireResistant()
                    .stacksTo(1)));


    public static final RegistryObject<Item> COBRERECOCIDOBLOCK = ITEMS.register("cobre_recocido_block",
            () -> new BlockItem(ModBlocks.COBRERECOCIDOBLOCK.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(64)));


    public static final RegistryObject<Item> HIERRORECOCIDOBLOCK = ITEMS.register("hierro_recocido_block",
            () -> new BlockItem(ModBlocks.HIERRORECOCIDOBLOCK.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(64)));


    public static final RegistryObject<Item> HIERROLISO = ITEMS.register("hierro_liso",
            () -> new BlockItem(ModBlocks.HIERROLISO.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(64)));


    public static final RegistryObject<Item> COBRELISO = ITEMS.register("cobre_liso",
            () -> new BlockItem(ModBlocks.COBRELISO.get(), new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .stacksTo(64)));


    public static final RegistryObject<Item> TRANSFORMER = ITEMS.register("transformer_block",
            () -> new BlockItem(ModBlocks.TRANSFORMER.get(), new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .stacksTo(64)));


    public static final RegistryObject<Item> BANABLOCK = ITEMS.register("bana_block",
            () -> new BlockItem(ModBlocks.BANABLOCK.get(), new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .stacksTo(64)));

    public static final RegistryObject<Item> SUPERBLOCK = ITEMS.register("super_block",
            () -> new BlockItem(ModBlocks.SUPERBLOCK.get(), new Item.Properties()
                    .rarity(Rarity.EPIC)
                    .stacksTo(64)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
