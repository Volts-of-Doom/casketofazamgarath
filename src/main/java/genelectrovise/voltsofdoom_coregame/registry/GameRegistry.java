package genelectrovise.voltsofdoom_coregame.registry;

import genelectrovise.voltsofdoom_coregame.main.VoltsOfDoomGame;
import genelectrovise.voltsofdoom_coresystem.annotation.GenericRegistryHolder;
import genelectrovise.voltsofdoom_coresystem.annotation.Mod;
import genelectrovise.voltsofdoom_coresystem.registry.generic.GenericRegistry;
import genelectrovise.voltsofdoom_coresystem.registry.mod.RegistryObject;

@GenericRegistryHolder(holderId = VoltsOfDoomGame.MODID)
public class GameRegistry {
	public static final GenericRegistry<ModItemTest> MOD_ITEM_TEST_REGISTRY = new GenericRegistry<ModItemTest>();
	
	public static final RegistryObject<ModItemTest> TEST_OBJ = MOD_ITEM_TEST_REGISTRY.register("test_obj", new RegistryObject<ModItemTest>());;
	
	public GameRegistry() {
		MOD_ITEM_TEST_REGISTRY.addToGenericRegisteringQueue((Mod) VoltsOfDoomGame.instance);
	}
}
