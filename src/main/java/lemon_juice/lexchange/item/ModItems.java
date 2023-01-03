package lemon_juice.lexchange.item;

import lemon_juice.lexchange.Lexchange;
import lemon_juice.lexchange.item.tools.ModTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lexchange.MOD_ID);

    public static final RegistryObject<Item> BALANCE_SHARD = ITEMS.register("balance_shard", () -> new BalanceShardItem(new Item.Properties()));
    public static final RegistryObject<Item> BALANCE_STONE = ITEMS.register("balance_stone", () -> new BalanceStoneItem(new Item.Properties()));
    public static final RegistryObject<Item> BALANCE_SWORD = ITEMS.register("balance_sword", () -> new SwordItem(ModTiers.BALANCE, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> INERT_STONE = ITEMS.register("inert_stone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
