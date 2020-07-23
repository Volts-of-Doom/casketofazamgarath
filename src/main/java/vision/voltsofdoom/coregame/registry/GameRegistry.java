package vision.voltsofdoom.coregame.registry;

import vision.voltsofdoom.coregame.main.VoltsOfDoomGame;
import vision.voltsofdoom.coresystem.loading.registry.RegistryObjectRetriever;
import vision.voltsofdoom.coresystem.loading.registry.RegistryType;
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

	public static RegistryType<Tile> TILE_SECOND_TYPE;

	public static TypeRegistry<Tile> TILE_SECOND;
	public static TypeRegistry<Entity> ENTITY_SECOND_TO_BE_MERGED;
	public static TypeRegistry<Tile> TILES;
	public static TypeRegistry<Entity> ENTITIES;

	public static RegistryObjectRetriever<Tile> test_tile;
	public static RegistryObjectRetriever<Tile> test_tile_second;
	public static RegistryObjectRetriever<Entity> test_entity;
	public static RegistryObjectRetriever<Entity> test_entity_merged;

	public GameRegistry() {
		VODLog4J.LOGGER.status("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
	}

	@Stowaway
	private static void createRegistryTypes(RegistryEvent.CreateRegistryTypesEvent event) {
		VODLog4J.LOGGER.info("Creating RegistryTypes");
		TILE_SECOND_TYPE = event.createRegistryType(new ResourceLocation(VoltsOfDoomGame.MODID, "tile_second"), Tile.class);
	}

	@Stowaway
	private static void createAndSubmitTypeRegistries(RegistryEvent.CreateAndSubmitRegistriesEvent event) {
		VODLog4J.LOGGER.info("Creating and submitting TypeRegistries");
		TILES = new TypeRegistry<Tile>(new ResourceLocation(VoltsOfDoomGame.MODID, "tiles"), RegistryTypes.TILES);
		ENTITIES = new TypeRegistry<Entity>(new ResourceLocation(VoltsOfDoomGame.MODID, "entities"), RegistryTypes.ENTITIES);
		TILE_SECOND = new TypeRegistry<Tile>(new ResourceLocation(VoltsOfDoomGame.MODID, "tile_second"), TILE_SECOND_TYPE);
		ENTITY_SECOND_TO_BE_MERGED = new TypeRegistry<Entity>(new ResourceLocation(VoltsOfDoomGame.MODID, "entity_second_to_be_merged"), RegistryTypes.ENTITIES);
		event.submit(TILES);
		event.submit(ENTITIES);
		event.submit(TILE_SECOND);
		event.submit(ENTITY_SECOND_TO_BE_MERGED);
	}

	@Stowaway
	private static void populateTypeRegistriesEventListener(RegistryEvent.PopulateTypeRegistriesEvent event) {
		VODLog4J.LOGGER.info("Populating TypeRegistries");
		test_tile = TILES.register(new ResourceLocation(VoltsOfDoomGame.MODID, "test_tile"), () -> new Tile(Tile.Archetype.COBBLE));

		test_tile_second = TILE_SECOND.register(new ResourceLocation(VoltsOfDoomGame.MODID, "tile_second"), () -> new Tile(Tile.Archetype.WOODLOG));

		test_entity = ENTITIES.register(new ResourceLocation(VoltsOfDoomGame.MODID, "entity"), () -> new Entity(Entity.Archetype.ENTITYBLOB));
		test_entity_merged = ENTITY_SECOND_TO_BE_MERGED.register(new ResourceLocation(VoltsOfDoomGame.MODID, "entity_second"), () -> new Entity(Entity.Archetype.ENTITYBLOB));
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
