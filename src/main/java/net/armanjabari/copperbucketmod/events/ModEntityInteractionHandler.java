package net.armanjabari.copperbucketmod.events;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.armanjabari.copperbucketmod.item.ModItems;

public class ModEntityInteractionHandler {
    public static void register() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (!world.isClient && entity instanceof CowEntity) {
                ItemStack heldItem = player.getStackInHand(hand);

                if (heldItem.isOf(ModItems.COPPER_BUCKET)) {
                    ItemStack milkBucket = new ItemStack(ModItems.MILK_COPPER_BUCKET);

                    world.playSound(null, player.getBlockPos(), SoundEvents.ITEM_BUCKET_FILL, SoundCategory.PLAYERS, 1.0F, 1.0F);

                    if (player.getAbilities().creativeMode) {
                        player.setStackInHand(hand, milkBucket);
                    } else {
                        heldItem.decrement(1);
                        if (!player.getInventory().insertStack(milkBucket)) {
                            player.setStackInHand(hand, milkBucket);
                        }
                    }

                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });
    }
}
