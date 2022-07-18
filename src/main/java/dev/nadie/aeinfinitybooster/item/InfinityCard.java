package dev.nadie.aeinfinitybooster.item;

import dev.nadie.aeinfinitybooster.AEInfinityBooster;
import net.minecraft.item.Item;

public class InfinityCard extends Item {
    public InfinityCard() {
        super(new Item.Properties().tab(AEInfinityBooster.CREATIVE_MODE_TAB).durability(0));
    }
}
