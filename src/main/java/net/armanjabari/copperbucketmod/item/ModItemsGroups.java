package net.armanjabari.copperbucketmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.armanjabari.copperbucketmod.CopperBucketMod;

public class ModItemsGroups {
    public static final ItemGroup COPPER_BUCKET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CopperBucketMod.MOD_ID, "copper_bucket_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WATER_COPPER_BUCKET))
                    .displayName(Text.translatable("itemgroup.copper-bucket-mod.copper_bucket_items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_BUCKET);
                        entries.add(ModItems.MILK_COPPER_BUCKET);
                        entries.add(ModItems.CREAM_BUCKET);
                        entries.add(ModItems.ICE_CREAM_BUCKET);
                        entries.add(ModItems.CHOCOLATE_MILK);
                        entries.add(ModItems.CHOCOLATE_ICE_CREAM);
                        entries.add(ModItems.APPLE_JUICE);
                        entries.add(ModItems.APPLE_ICE_CREAM);
                        entries.add(ModItems.CARROT_JUICE);
                        entries.add(ModItems.CARROT_ICE_CREAM);
                        entries.add(ModItems.SWEET_BERRIES_JUICE);
                        entries.add(ModItems.SWEET_BERRIES_ICE_CREAM);
                        entries.add(ModItems.MELON_JUICE);
                        entries.add(ModItems.MELON_ICE_CREAM);
                        entries.add(ModItems.GLOW_BERRIES_JUICE);
                        entries.add(ModItems.GLOW_BERRIES_ICE_CREAM);

                    })).build());

    public static void registerItemsGroups() {
        CopperBucketMod.LOGGER.info("Registering Item Groups for " + CopperBucketMod.MOD_ID);
    }
}
