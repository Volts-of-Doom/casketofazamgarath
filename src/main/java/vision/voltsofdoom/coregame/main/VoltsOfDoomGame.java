package vision.voltsofdoom.coregame.main;

import vision.voltsofdoom.coregame.registry.GameRegistry;
import vision.voltsofdoom.coresystem.loading.mod.Mod;

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
