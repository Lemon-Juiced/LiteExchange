package lemon_juice.lexchange.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BalanceShardItem extends Item {
    public BalanceShardItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.literal("4% Drop Chance on All Hostile Mobs").withStyle(ChatFormatting.YELLOW));
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.RARE;
    }
}
