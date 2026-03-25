package dev.lemon_juice.lexchange.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.ItemStackTemplate;
import org.jetbrains.annotations.NotNull;

public class BalanceStoneItem extends Item {

    public BalanceStoneItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStackTemplate getCraftingRemainder(@NotNull ItemInstance item) {
        return new ItemStackTemplate(this);
    }


}
