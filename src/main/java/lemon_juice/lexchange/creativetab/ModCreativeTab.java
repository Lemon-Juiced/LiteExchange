package lemon_juice.lexchange.creativetab;

import lemon_juice.lexchange.Lexchange;
import lemon_juice.lexchange.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.f_279569_, Lexchange.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEXCHANGE_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lexchange"))
            .icon(() -> new ItemStack(ModItems.BALANCE_STONE.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == LEXCHANGE_TAB.get()){
            event.accept(ModItems.BALANCE_STONE.get());
            event.accept(ModItems.BALANCE_SHARD.get());
            event.accept(ModItems.INERT_STONE.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
