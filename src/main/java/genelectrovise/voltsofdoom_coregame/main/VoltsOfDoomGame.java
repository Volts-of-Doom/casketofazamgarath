package genelectrovise.voltsofdoom_coregame.main;

import genelectrovise.voltsofdoom_coregame.registry.GameRegistry;
import genelectrovise.voltsofdoom_coresystem.annotation.Mod;
import genelectrovise.voltsofdoom_coresystem.main.IModMainClass;

@Mod(modid = VoltsOfDoomGame.MODID)
public class VoltsOfDoomGame implements IModMainClass {
	public static final String MODID = "voltsofdoom_coregame";
	private GameRegistry gameregistry;
	public static VoltsOfDoomGame instance;

	public VoltsOfDoomGame() {
		gameregistry = new GameRegistry();
	}

	public GameRegistry getGameregistry() {
		return gameregistry;
	}

	public String getModid() {
		return "vod_coregame";
	}
}
