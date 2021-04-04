package vision.voltsofdoom.coregame.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vision.voltsofdoom.coregame.registry.GameRegistry;
import vision.voltsofdoom.zapbyte.mod.Mod;

@Mod(modid = CasketOfAzamgarath.MODID)
public class CasketOfAzamgarath {
  public static final String MODID = "casketofazamgarath";
  private GameRegistry gameRegistry;
  public static CasketOfAzamgarath instance;
  
  public static Logger LOGGER = LoggerFactory.getLogger(CasketOfAzamgarath.class);

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
