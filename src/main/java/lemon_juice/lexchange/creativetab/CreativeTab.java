package lemon_juice.lexchange.creativetab;

import lemon_juice.lexchange.Lexchange;
import lemon_juice.lexchange.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    public static ResourceLocation LEXCHANGE_TAB = new ResourceLocation(Lexchange.MOD_ID, "lexchange");

    public static void registerTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(LEXCHANGE_TAB, builder -> builder
                .title(Component.translatable("itemGroup.lexchange"))
                .icon(() -> new ItemStack(ModItems.BALANCE_STONE.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.BALANCE_SHARD.get()));
                    output.accept(new ItemStack(ModItems.BALANCE_STONE.get()));
                    output.accept(new ItemStack(ModItems.INERT_STONE.get()));
                }));
    }
}
