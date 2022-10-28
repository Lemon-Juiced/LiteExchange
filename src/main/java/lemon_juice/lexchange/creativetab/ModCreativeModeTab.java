package lemon_juice.lexchange.creativetab;

import lemon_juice.lexchange.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LEXCHANGE_TAB = new CreativeModeTab("lexchangeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BALANCE_STONE.get());
        }
    };
}
