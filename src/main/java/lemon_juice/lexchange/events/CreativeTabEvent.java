package lemon_juice.lexchange.events;

import lemon_juice.lexchange.Lexchange;
import lemon_juice.lexchange.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CreativeTabEvent {
    public static CreativeModeTab LEXCHANGE_TAB;

    @SubscribeEvent
    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event){
        LEXCHANGE_TAB = event.registerCreativeModeTab(new ResourceLocation(Lexchange.MOD_ID, "lexchange"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.BALANCE_STONE.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.BALANCE_SHARD.get()));
                        output.accept(new ItemStack(ModItems.BALANCE_STONE.get()));
                        output.accept(new ItemStack(ModItems.INERT_STONE.get()));
                    })
                    .title(Component.translatable("itemGroup.lexchange"))
                    .build();
        });
    }
}
