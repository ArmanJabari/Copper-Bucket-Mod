package net.armanjabari.copperbucketmod.events;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.armanjabari.copperbucketmod.item.ModItems;

public class ModBlockInteractionHandler {
    public static void register() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            BlockPos pos = hitResult.getBlockPos();
            if (!world.isClient && world.getBlockState(pos).isOf(Blocks.POWDER_SNOW)) {
                ItemStack heldItem = player.getStackInHand(hand);

                if (heldItem.isOf(ModItems.CREAM_BUCKET)) {
                    ItemStack newItem = new ItemStack(ModItems.ICE_CREAM_BUCKET);
                    player.setStackInHand(hand, newItem);

                    world.playSound(null, pos, SoundEvents.BLOCK_SNOW_BREAK, SoundCategory.PLAYERS, 1.0F, 1.0F);
                    world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_HIT, SoundCategory.PLAYERS, 0.8F, 1.3F);

                    world.breakBlock(pos, false);

                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });
    }
}
