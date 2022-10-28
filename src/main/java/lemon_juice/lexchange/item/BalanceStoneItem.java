package lemon_juice.lexchange.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BalanceStoneItem extends Item {
    public BalanceStoneItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(ModItems.BALANCE_STONE.get());
    }
}
