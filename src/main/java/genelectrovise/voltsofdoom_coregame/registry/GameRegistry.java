package genelectrovise.voltsofdoom_coregame.registry;

import genelectrovise.voltsofdoom_coregame.main.VoltsOfDoomGame;
import genelectrovise.voltsofdoom_coresystem.annotation.GenericRegistryHolder;
import genelectrovise.voltsofdoom_coresystem.annotation.Mod;
import genelectrovise.voltsofdoom_coresystem.entity.Entity;
import genelectrovise.voltsofdoom_coresystem.log.VODLog4J;
import genelectrovise.voltsofdoom_coresystem.main.ModItemTest;
import genelectrovise.voltsofdoom_coresystem.registry.GenericRegistry;
import genelectrovise.voltsofdoom_coresystem.registry.RegistryObject;
import genelectrovise.voltsofdoom_coresystem.tile.Tile;

@GenericRegistryHolder(holderId = VoltsOfDoomGame.MODID)
public class GameRegistry {
	public static final GenericRegistry<ModItemTest> MOD_ITEM_TEST_REGISTRY = new GenericRegistry<ModItemTest>(
			ModItemTest.class, VoltsOfDoomGame.class.getAnnotation(Mod.class));
	public static final GenericRegistry<Tile> TILE_REGISTRY = new GenericRegistry<Tile>(Tile.class,
			VoltsOfDoomGame.class.getAnnotation(Mod.class));
	public static final GenericRegistry<Entity> ENTITY_REGISTRY = new GenericRegistry<Entity>(Entity.class,
			VoltsOfDoomGame.class.getAnnotation(Mod.class));

	public static final RegistryObject<ModItemTest> TEST_OBJ = MOD_ITEM_TEST_REGISTRY.register("test_obj",
			new RegistryObject<ModItemTest>(null));
	public static final RegistryObject<Tile> TILE_COBBLE = TILE_REGISTRY.register("tilecobble",
			new RegistryObject<Tile>(null));;
	public static final RegistryObject<Tile> TILE_WOODLOG = TILE_REGISTRY.register("tilewoodlog",
			new RegistryObject<Tile>(null));;
	public static final RegistryObject<Tile> TILE_DOOR = TILE_REGISTRY.register("door",
			new RegistryObject<Tile>(null));;

	public static final RegistryObject<Entity> ENTITY_BLOB = ENTITY_REGISTRY.register("entityblob",
			new RegistryObject<Entity>(null));;

	public GameRegistry() {
		VODLog4J.LOGGER.status("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
		MOD_ITEM_TEST_REGISTRY.addToGenericRegisteringQueue((Mod) VoltsOfDoomGame.instance);
		TILE_REGISTRY.addToGenericRegisteringQueue((Mod) VoltsOfDoomGame.instance);
		ENTITY_REGISTRY.addToGenericRegisteringQueue((Mod) VoltsOfDoomGame.instance);
	}
}
