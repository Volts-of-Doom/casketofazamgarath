package genelectrovise.voltsofdoom_coregame.registry;

import genelectrovise.voltsofdoom_coregame.main.VoltsOfDoomGame;
import genelectrovise.voltsofdoom_coresystem.annotation.GenericRegistryHolder;
import genelectrovise.voltsofdoom_coresystem.annotation.Mod;
import genelectrovise.voltsofdoom_coresystem.main.ModItemTest;
import genelectrovise.voltsofdoom_coresystem.registry.generic.GenericRegistry;
import genelectrovise.voltsofdoom_coresystem.registry.mod.RegistryObject;
import genelectrovise.voltsofdoom_coresystem.util.VODLog;

@GenericRegistryHolder(holderId = VoltsOfDoomGame.MODID)
public class GameRegistry {
	public static final GenericRegistry<ModItemTest> MOD_ITEM_TEST_REGISTRY = new GenericRegistry<ModItemTest>(
			ModItemTest.class, VoltsOfDoomGame.class.getAnnotation(Mod.class));

	public static final RegistryObject<ModItemTest> TEST_OBJ = MOD_ITEM_TEST_REGISTRY.register("test_obj",
			new RegistryObject<ModItemTest>());;

	public GameRegistry() {
		VODLog.LOGGER.status("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
		MOD_ITEM_TEST_REGISTRY.addToGenericRegisteringQueue((Mod) VoltsOfDoomGame.instance);
	}
}
