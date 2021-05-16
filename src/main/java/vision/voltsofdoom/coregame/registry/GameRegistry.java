package vision.voltsofdoom.coregame.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vision.voltsofdoom.coregame.main.CasketOfAzamgarath;
import vision.voltsofdoom.voltsofdoom.VoltsOfDoom;
import vision.voltsofdoom.voltsofdoom.tile.Tile;
import vision.voltsofdoom.zapbyte.bandwagon.Stowaway;
import vision.voltsofdoom.zapbyte.bandwagon.event.LoadingDoneEvent;
import vision.voltsofdoom.zapbyte.bandwagon.event.LoadingEvent;
import vision.voltsofdoom.zapbyte.registry.IRegistryMessenger2;
import vision.voltsofdoom.zapbyte.resource.ID;

/**
 * Note: Please someone rewrite this before using it.
 * 
 * @author GenElectrovise
 *
 */
@Stowaway
public class GameRegistry {

  private static final Logger LOGGER = LoggerFactory.getLogger(GameRegistry.class);
  
  public static final IRegistryMessenger2<Tile> temporary_messenger = VoltsOfDoom.getInstance().getRegistry().register(new ID(CasketOfAzamgarath.MODID, "temporary_messenger"), () -> new Tile(), Tile.class);

  public GameRegistry() {
    
    @SuppressWarnings("unused")
    Tile tile = temporary_messenger.get();
    
  }

  @Stowaway
  private static void loadingDone(LoadingDoneEvent event) {
    LOGGER.info("Casket of Azamgarath Loading Done");
  }

  // DEBUG

  public static void typeStowawayTestObject(Object notAnEvent) {

  }

  public static void typeStowawayTestNotEvent(String notAnEvent) {

  }

  @Stowaway
  public static void methodStowawayTest(LoadingEvent.TestEvent event) {
    
  }

  @Stowaway
  public static void bandWagonCreationEvent(LoadingEvent.BandWagonCreation event) {
    
  }
}
