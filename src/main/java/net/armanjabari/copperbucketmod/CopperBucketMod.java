package net.armanjabari.copperbucketmod;

import net.fabricmc.api.ModInitializer;
import net.armanjabari.copperbucketmod.item.ModItems;
import net.armanjabari.copperbucketmod.item.ModItemsGroups;
import net.armanjabari.copperbucketmod.events.ModEntityInteractionHandler;
import net.armanjabari.copperbucketmod.events.ModBlockInteractionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperBucketMod implements ModInitializer {
    public static final String MOD_ID = "copper-bucket-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemsGroups.registerItemsGroups();
        ModItems.registerModItems();
        ModEntityInteractionHandler.register();
        ModBlockInteractionHandler.register();

    }
}
