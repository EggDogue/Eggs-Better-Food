package net.eggdogue.eggsbettervanillafood.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup EGGS_BETTER_FOOD_GROUP = new ItemGroup("eggsbettervanillafood") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CURED_ROTTEN_FLESH.get());
        }
    };
}
