package vision.voltsofdoom.coregame.registry;

import vision.voltsofdoom.coregame.main.VoltsOfDoomGame;
import vision.voltsofdoom.coresystem.loading.registry.RegistryObjectRetriever;
import vision.voltsofdoom.coresystem.loading.registry.RegistryTypes;
import vision.voltsofdoom.coresystem.loading.registry.TypeRegistry;
import vision.voltsofdoom.coresystem.loading.resource.ResourceLocation;
import vision.voltsofdoom.coresystem.play.entity.Entity;
import vision.voltsofdoom.coresystem.play.tile.Tile;
import vision.voltsofdoom.coresystem.universal.band_wagon.Stowaway;
import vision.voltsofdoom.coresystem.universal.event.LoadingEvent;
import vision.voltsofdoom.coresystem.universal.event.RegistryEvent;
import vision.voltsofdoom.coresystem.universal.log.VODLog4J;

@Stowaway
public class GameRegistry {

	public static TypeRegistry<Tile> TILES;
	public static TypeRegistry<Entity> ENTITIES;

	public static RegistryObjectRetriever<Tile> test_tile;

	public GameRegistry() {
		VODLog4J.LOGGER.status("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
	}

	@Stowaway
	private static void createAndSubmitTypeRegistries(RegistryEvent.CreateAndSubmitTypeRegistriesEvent event) {
		TILES = new TypeRegistry<Tile>(new ResourceLocation(VoltsOfDoomGame.MODID, "tiles"), RegistryTypes.TILES);
		ENTITIES = new TypeRegistry<Entity>(new ResourceLocation(VoltsOfDoomGame.MODID, "entities"), RegistryTypes.ENTITIES);
	}

	@Stowaway
	private static void populateTypeRegistriesEventListener(RegistryEvent.PopulateTypeRegistriesEvent event) {
		test_tile = TILES.register(new ResourceLocation(VoltsOfDoomGame.MODID, "test_tile"), () -> new Tile(Tile.Archetype.COBBLE));
	}

	// DEBUG

	public static void typeStowawayTestObject(Object notAnEvent) {

	}

	public static void typeStowawayTestNotEvent(String notAnEvent) {

	}

	@Stowaway
	public static void methodStowawayTest(LoadingEvent.TestEvent event) {
		VODLog4J.LOGGER.info("Volts of Doom Coregame (GameRegistry#methodStowawayTest) has heard a LoadingEvent.TestEvent Event!");
	}

	@Stowaway
	public static void bandWagonCreationEvent(LoadingEvent.BandWagonCreation event) {
		VODLog4J.LOGGER.info("Volts of Doom Coregame (GameRegistry#bandWagonCreationEvent) has heard the LoadingEvent.BandWagonCreation Event!");
	}
}
