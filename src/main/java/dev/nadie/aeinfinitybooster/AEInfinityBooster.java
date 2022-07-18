package dev.nadie.aeinfinitybooster;

import dev.nadie.aeinfinitybooster.setup.ModItems;
import dev.nadie.aeinfinitybooster.setup.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("aeinfinitybooster")
public class AEInfinityBooster {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String ID = "aeinfinitybooster";

    public static final ItemGroup CREATIVE_MODE_TAB = new ItemGroup(ID) {
        @Override
        public ItemStack makeIcon() {
            // Infinity Card
            return new ItemStack(ModItems.INFINITY_CARD.get());
        }
    };

    public AEInfinityBooster() {

        Registration.register();

    }

}
