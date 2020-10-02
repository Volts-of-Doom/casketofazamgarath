package vision.voltsofdoom.coregame.main;

import vision.voltsofdoom.coregame.registry.GameRegistry;
import vision.voltsofdoom.zapbyte.loading.mod.Mod;

@Mod(modid = CasketOfAzamgarath.MODID)
public class CasketOfAzamgarath {
  public static final String MODID = "casketofazamgarath";
  private GameRegistry gameRegistry;
  public static CasketOfAzamgarath instance;

  public CasketOfAzamgarath() {
    gameRegistry = new GameRegistry();
  }

  public GameRegistry getGameregistry() {
    return gameRegistry;
  }

  public String getModid() {
    return "vod_coregame";
  }
}
