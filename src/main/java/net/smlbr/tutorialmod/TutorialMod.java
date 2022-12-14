package net.smlbr.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.smlbr.tutorialmod.Painting.ModPaintings;
import net.smlbr.tutorialmod.block.ModBlocks;
import net.smlbr.tutorialmod.item.ModItems;
import net.smlbr.tutorialmod.util.ModLootTableModifiers;
import net.smlbr.tutorialmod.villager.ModVillagers;
import net.smlbr.tutorialmod.world.feature.ModConfiguredFeatures;
import net.smlbr.tutorialmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String TUTORIALMOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(TUTORIALMOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfigFeatures();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModOreGeneration.GeneratedOres();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModPaintings.registerPaintings();

		ModLootTableModifiers.modifyLootTables();

	}
}
