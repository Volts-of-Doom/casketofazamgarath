package genelectrovise.voltsofdoom_coregame.main;

import genelectrovise.voltsofdoom_coregame.registry.GameRegistry;
import genelectrovise.voltsofdoom_coresystem.universal.annotation.Mod;

@Mod(modid = VoltsOfDoomGame.MODID)
public class VoltsOfDoomGame {
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
