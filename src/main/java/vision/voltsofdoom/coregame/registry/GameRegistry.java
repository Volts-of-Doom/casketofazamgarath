package vision.voltsofdoom.coregame.registry;

import vision.voltsofdoom.coregame.main.CasketOfAzamgarath;
import vision.voltsofdoom.coresystem.loading.registry.RegistryMessenger;
import vision.voltsofdoom.coresystem.loading.registry.RegistryType;
import vision.voltsofdoom.coresystem.loading.registry.RegistryTypes;
import vision.voltsofdoom.coresystem.loading.registry.TypeRegistry;
import vision.voltsofdoom.coresystem.play.entity.Entity;
import vision.voltsofdoom.coresystem.play.tile.Tile;
import vision.voltsofdoom.coresystem.universal.band_wagon.Stowaway;
import vision.voltsofdoom.coresystem.universal.event.LoadingEvent;
import vision.voltsofdoom.coresystem.universal.event.RegistryEvent;
import vision.voltsofdoom.zapbyte.log.Loggers;
import vision.voltsofdoom.zapbyte.misc.ResourceLocation;

/**
 * Note: Please someone rewrite this before using it.
 * 
 * @author GenElectrovise
 *
 */
@Stowaway
public class GameRegistry {

	public static RegistryType<Tile> TILE_SECOND_TYPE;

	public static TypeRegistry<Tile> TILE_SECOND;
	public static TypeRegistry<Entity> ENTITY_SECOND_TO_BE_MERGED;
	public static TypeRegistry<Tile> TILES;
	public static TypeRegistry<Entity> ENTITIES;

	public static RegistryMessenger<Tile> test_tile;
	public static RegistryMessenger<Tile> test_tile_second;
	public static RegistryMessenger<Entity> test_entity;
	public static RegistryMessenger<Entity> test_entity_merged;

	public GameRegistry() {
		Loggers.MOD.info("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
	}

	@Stowaway
	private static void createRegistryTypes(RegistryEvent.CreateRegistryTypesEvent event) {
		Loggers.MOD_DETAIL.fine("Creating RegistryTypes");
		TILE_SECOND_TYPE = event.createRegistryType(new ResourceLocation(CasketOfAzamgarath.MODID, "tile_second"), Tile.class);
	}

	@Stowaway
	private static void createAndSubmitTypeRegistries(RegistryEvent.CreateAndSubmitRegistriesEvent event) {
		Loggers.MOD_DETAIL.fine("Creating and submitting TypeRegistries");
		TILES = new TypeRegistry<Tile>(new ResourceLocation(CasketOfAzamgarath.MODID, "tiles"), RegistryTypes.TILES);
		ENTITIES = new TypeRegistry<Entity>(new ResourceLocation(CasketOfAzamgarath.MODID, "entities"), RegistryTypes.ENTITIES);
		TILE_SECOND = new TypeRegistry<Tile>(new ResourceLocation(CasketOfAzamgarath.MODID, "tile_second"), TILE_SECOND_TYPE);
		ENTITY_SECOND_TO_BE_MERGED = new TypeRegistry<Entity>(new ResourceLocation(CasketOfAzamgarath.MODID, "entity_second_to_be_merged"), RegistryTypes.ENTITIES);
		event.submit(TILES);
		event.submit(ENTITIES);
		event.submit(TILE_SECOND);
		event.submit(ENTITY_SECOND_TO_BE_MERGED);
	}

	@Stowaway
	private static void populateTypeRegistriesEventListener(RegistryEvent.PopulateTypeRegistriesEvent event) {
		Loggers.MOD_DETAIL.fine("Populating TypeRegistries");
		test_tile = TILES.register(new ResourceLocation(CasketOfAzamgarath.MODID, "test_tile"), () -> new Tile(Tile.Archetype.COBBLE));

		test_tile_second = TILE_SECOND.register(new ResourceLocation(CasketOfAzamgarath.MODID, "tile_second"), () -> new Tile(Tile.Archetype.WOODLOG));

		test_entity = ENTITIES.register(new ResourceLocation(CasketOfAzamgarath.MODID, "entity"), () -> new Entity(Entity.Archetype.ENTITYBLOB));
		test_entity_merged = ENTITY_SECOND_TO_BE_MERGED.register(new ResourceLocation(CasketOfAzamgarath.MODID, "entity_second"), () -> new Entity(Entity.Archetype.ENTITYBLOB));
	}

	@Stowaway
	private static void loadingDone(RegistryEvent.LoadingDoneEvent event) {
		System.out.println("Test tile" + test_tile.get());
		test_tile.get();
	}

	// DEBUG

	public static void typeStowawayTestObject(Object notAnEvent) {

	}

	public static void typeStowawayTestNotEvent(String notAnEvent) {

	}

	@Stowaway
	public static void methodStowawayTest(LoadingEvent.TestEvent event) {
		Loggers.MOD_DETAIL.fine("Volts of Doom Coregame (GameRegistry#methodStowawayTest) has heard a LoadingEvent.TestEvent Event!");
	}

	@Stowaway
	public static void bandWagonCreationEvent(LoadingEvent.BandWagonCreation event) {
		Loggers.MOD_DETAIL.fine("Volts of Doom Coregame (GameRegistry#bandWagonCreationEvent) has heard the LoadingEvent.BandWagonCreation Event!");
	}
}
