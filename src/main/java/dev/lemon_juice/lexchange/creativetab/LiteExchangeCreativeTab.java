package dev.lemon_juice.lexchange.creativetab;

import dev.lemon_juice.lexchange.LiteExchange;
import dev.lemon_juice.lexchange.item.LiteExchangeItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LiteExchangeCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LiteExchange.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEXCHANGE_TAB = CREATIVE_MODE_TABS.register("lexchange", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lexchange.lite_exchange"))
            .icon(() -> new ItemStack(LiteExchangeItems.BALANCE_STONE.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == LEXCHANGE_TAB.get()){
            event.accept(LiteExchangeItems.BALANCE_STONE.get());
            event.accept(LiteExchangeItems.BALANCE_SHARD.get());
            event.accept(LiteExchangeItems.INERT_STONE.get());
        }
    }

    /**
     * Registers the creative tab with the event bus.
     * @param eventBus The event bus to register with.
     */
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
