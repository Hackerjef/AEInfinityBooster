package dev.nadie.aeinfinitybooster.item;

import dev.nadie.aeinfinitybooster.AEInfinityBooster;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class InfinityCard extends Item {
    public InfinityCard() {
        super(new Item.Properties().tab(AEInfinityBooster.CREATIVE_MODE_TAB).durability(0));
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        p_77624_3_.add(new StringTextComponent("Blame EvilNomZ!").withStyle(TextFormatting.DARK_RED).withStyle(TextFormatting.ITALIC));
        super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
    }
}
