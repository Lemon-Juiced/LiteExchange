package dev.lemon_juice.lexchange.item;

import dev.lemon_juice.lexchange.Lexchange;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lexchange.MOD_ID);

    public static final DeferredItem<Item> BALANCE_SHARD = ITEMS.register("balance_shard", () -> new BalanceShardItem(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> BALANCE_STONE = ITEMS.register("balance_stone", () -> new BalanceStoneItem(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> INERT_STONE = ITEMS.register("inert_stone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
