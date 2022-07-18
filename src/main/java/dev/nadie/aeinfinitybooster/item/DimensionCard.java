package dev.nadie.aeinfinitybooster.item;

import dev.nadie.aeinfinitybooster.AEInfinityBooster;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/**
 * DimensionCard
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 11:19 am
 */

public class DimensionCard extends Item {
    public DimensionCard() {
        super(new Item.Properties().tab(AEInfinityBooster.CREATIVE_MODE_TAB).durability(0));
    }

    @Override
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }
}
