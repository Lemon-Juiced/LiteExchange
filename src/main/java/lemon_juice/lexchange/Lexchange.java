package lemon_juice.lexchange;

import lemon_juice.lexchange.creativetab.ModCreativeTab;
import lemon_juice.lexchange.handler.MobDropHandler;
import lemon_juice.lexchange.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Lexchange.MOD_ID)
public class Lexchange {
    public static final String MOD_ID = "lexchange";
    public Lexchange(IEventBus modEventBus) {
        // Register commonSetup (Mob Drops)
        modEventBus.addListener(this::commonSetup);

        // Register Items
        ModItems.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Register Balance Shard Drops (Independent of Global Loot Modifiers)
        NeoForge.EVENT_BUS.register(new MobDropHandler());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
