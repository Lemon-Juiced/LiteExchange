package lemon_juice.lexchange.item.tools;

import lemon_juice.lexchange.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    /*
    WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
      return Ingredient.of(ItemTags.PLANKS);
      }),
    STONE(1, 131, 4.0F, 1.0F, 5, () -> {
      return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
      }),
    IRON(2, 250, 6.0F, 2.0F, 14, () -> {
      return Ingredient.of(Items.IRON_INGOT);
      }),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
      return Ingredient.of(Items.DIAMOND);
      }),
    GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
      return Ingredient.of(Items.GOLD_INGOT);
      }),
    NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
      return Ingredient.of(Items.NETHERITE_INGOT);
      });
    */

    public static final ForgeTier BALANCE = new ForgeTier(1, 1561, 4.0F, 1.0F, 5, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.BALANCE_SHARD.get()));
}
