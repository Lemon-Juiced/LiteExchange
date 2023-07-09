package lemon_juice.lexchange;

import lemon_juice.lexchange.creativetab.ModCreativeTab;
import lemon_juice.lexchange.handler.MobDropHandler;
import lemon_juice.lexchange.item.ModItems;
import lemon_juice.lexchange.loot.ModLootModifiers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Lexchange.MOD_ID)
public class Lexchange {
    public static final String MOD_ID = "lexchange";
    public Lexchange() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items
        ModItems.register(modEventBus);

        // Register Mod Loot Modifiers
        ModLootModifiers.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        // Register commonSetup (Mob Drops)
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Register Balance Shard Drops (Independent of Global Loot Modifiers)
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
