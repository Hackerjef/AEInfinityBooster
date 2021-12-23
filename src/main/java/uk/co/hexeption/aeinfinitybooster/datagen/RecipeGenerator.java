
package uk.co.hexeption.aeinfinitybooster.datagen;

import appeng.core.Api;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import uk.co.hexeption.aeinfinitybooster.AEInfinityBooster;
import uk.co.hexeption.aeinfinitybooster.setup.ModItems;

import java.util.function.Consumer;

/**
 * RecipeGenerator
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:35 pm
 */
public class RecipeGenerator extends RecipeProvider {

	public RecipeGenerator(DataGenerator generatorIn) {
		super(generatorIn);
	}


	@Override
	public String getName() {
		return "Hex - Recipes";
	}

	@Override
	protected void buildShapelessRecipes(Consumer<IFinishedRecipe> p_176532_) {
		ShapedRecipeBuilder.shaped(ModItems.INFINITY_CARD.get())
				.pattern("ERE").pattern("RSR").pattern("NNN")
				.define('E', Items.ENDER_EYE)
				.define('R', Api.instance().definitions().materials().wirelessBooster().asItem())
				.define('S', Items.NETHER_STAR)
				.define('N', Items.NETHERITE_INGOT)
				.unlockedBy("has_item", has(Items.NETHERITE_INGOT))
				.save(p_176532_, new ResourceLocation(AEInfinityBooster.ID, "infinity_card"));
		ShapedRecipeBuilder.shaped(ModItems.DIMENSION_CARD.get())
				.pattern("RNR").pattern("NEN").pattern("RNR")
				.define('R', ModItems.INFINITY_CARD.get())
				.define('E', Items.ENDER_EYE)
				.define('N', Items.NETHER_STAR)
				.unlockedBy("has_item", has(ModItems.INFINITY_CARD.get()))
				.save(p_176532_, new ResourceLocation(AEInfinityBooster.ID, "dimension_card"));
	}
}
