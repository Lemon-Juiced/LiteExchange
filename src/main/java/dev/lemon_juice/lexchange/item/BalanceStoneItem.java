package dev.lemon_juice.lexchange.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BalanceStoneItem extends Item {

    public BalanceStoneItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack itemStack) {
        return new ItemStack(ModItems.BALANCE_STONE.get());
    }

}
