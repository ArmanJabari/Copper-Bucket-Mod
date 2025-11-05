package net.armanjabari.copperbucketmod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class ReturnItemOnConsume extends Item {

    private final Item returnItem;
    private final UseAction useAction;

    public ReturnItemOnConsume(Settings settings, Item returnItem, UseAction useAction) {
        super(settings);
        this.returnItem = returnItem;
        this.useAction = useAction;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player && !player.getAbilities().creativeMode) {
            ItemStack returned = new ItemStack(returnItem);

            if (stack.isEmpty()) {
                return returned;
            } else {
                player.getInventory().insertStack(returned);
            }
        }

        return result;
    }


    @Override
    public UseAction getUseAction(ItemStack stack) {
        return useAction;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 32;
    }
}
