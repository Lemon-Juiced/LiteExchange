package dev.lemon_juice.lexchange;

import dev.lemon_juice.lexchange.creativetab.LiteExchangeCreativeTab;
import dev.lemon_juice.lexchange.handler.MobDropHandler;
import dev.lemon_juice.lexchange.item.LiteExchangeItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(LiteExchange.MOD_ID)
public class LiteExchange {
    public static final String MOD_ID = "lexchange";
    public LiteExchange(IEventBus modEventBus) {
        // Register commonSetup (Mob Drops)
        modEventBus.addListener(this::commonSetup);

        // Register Items
        LiteExchangeItems.register(modEventBus);

        // Register Creative Tab
        LiteExchangeCreativeTab.register(modEventBus);
        modEventBus.addListener(LiteExchangeCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Register Balance Shard Drops (Independent of Global Loot Modifiers)
        NeoForge.EVENT_BUS.register(new MobDropHandler());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
