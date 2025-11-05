package net.armanjabari.copperbucketmod.item;
import net.minecraft.util.UseAction;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.armanjabari.copperbucketmod.CopperBucketMod;

public class ModItems {

    public static final Item COPPER_BUCKET = registerItem("copper_bucket", new Item(new Item.Settings().maxCount(16)));
    public static final Item WATER_COPPER_BUCKET = registerItem("water_copper_bucket", new Item(new Item.Settings().maxCount(1)));

    public static final Item MILK_COPPER_BUCKET = registerItem("milk_copper_bucket",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.MILKCOPPERBUCKET), COPPER_BUCKET, UseAction.DRINK));

    public static final Item CREAM_BUCKET = registerItem("cream_bucket",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.CREAMBUCKET), COPPER_BUCKET, UseAction.EAT));

    public static final Item ICE_CREAM_BUCKET = registerItem("ice_cream_bucket",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.ICECREAMBUCKET), COPPER_BUCKET, UseAction.EAT));

    public static final Item CHOCOLATE_MILK = registerItem("chocolate_milk",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.CHOCOLATEMILK), COPPER_BUCKET, UseAction.DRINK));

    public static final Item CHOCOLATE_ICE_CREAM = registerItem("chocolate_ice_cream",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.CHOCOLATEICECREAM), COPPER_BUCKET, UseAction.EAT));

    public static final Item APPLE_JUICE = registerItem("apple_juice",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.APPLEJUICE), COPPER_BUCKET, UseAction.DRINK));

    public static final Item APPLE_ICE_CREAM = registerItem("apple_ice_cream",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.APPLEICECREAM), COPPER_BUCKET, UseAction.EAT));

    public static final Item CARROT_JUICE = registerItem("carrot_juice",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.CARROTJUICE), COPPER_BUCKET, UseAction.DRINK));

    public static final Item CARROT_ICE_CREAM = registerItem("carrot_ice_cream",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.CARROTICECREAM), COPPER_BUCKET, UseAction.EAT));

    public static final Item SWEET_BERRIES_JUICE = registerItem("sweet_berries_juice",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.SWEETBERRIESJUICE), COPPER_BUCKET, UseAction.DRINK));

    public static final Item SWEET_BERRIES_ICE_CREAM = registerItem("sweet_berries_ice_cream",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.SWEETBERRIESICECREAM), COPPER_BUCKET, UseAction.EAT));

    public static final Item MELON_JUICE = registerItem("melon_juice",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.MELONJUICE), COPPER_BUCKET, UseAction.DRINK));

    public static final Item MELON_ICE_CREAM = registerItem("melon_ice_cream",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.MELONICECREAM), COPPER_BUCKET, UseAction.EAT));

    public static final Item GLOW_BERRIES_JUICE = registerItem("glow_berries_juice",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.GLOWBERRIESJUICE), COPPER_BUCKET, UseAction.DRINK));

    public static final Item GLOW_BERRIES_ICE_CREAM = registerItem("glow_berries_ice_cream",
            new ReturnItemOnConsume(new Item.Settings().maxCount(1).food(ModFoodComponents.GLOWBERRIESICECREAM), COPPER_BUCKET, UseAction.EAT));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CopperBucketMod.MOD_ID , name), item);
    }

    public static void registerModItems() {
        CopperBucketMod.LOGGER.info("Register Mod Items " + CopperBucketMod.MOD_ID);

    }
}
