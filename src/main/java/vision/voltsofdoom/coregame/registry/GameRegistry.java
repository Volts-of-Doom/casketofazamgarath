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

  public GameRegistry() {
    CasketOfAzamgarath.LOGGER.info("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");

    IRegistryMessenger2<Tile> messenger = VoltsOfDoom.getInstance().getRegistry().register(new ID("temp", "temp_e"), () -> new Tile(), Tile.class);
    
    @SuppressWarnings("unused")
    Tile tile = messenger.get();
    
    System.out.println("210421 : " + messenger.get());
    
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
    CasketOfAzamgarath.LOGGER.debug("Volts of Doom Coregame (GameRegistry#methodStowawayTest) has heard a LoadingEvent.TestEvent Event!");
  }

  @Stowaway
  public static void bandWagonCreationEvent(LoadingEvent.BandWagonCreation event) {
    CasketOfAzamgarath.LOGGER.debug("Volts of Doom Coregame (GameRegistry#bandWagonCreationEvent) has heard the LoadingEvent.BandWagonCreation Event!");
  }
}
