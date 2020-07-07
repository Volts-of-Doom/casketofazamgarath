package vision.voltsofdoom.coregame.registry;

import vision.voltsofdoom.coresystem.universal.band_wagon.Stowaway;
import vision.voltsofdoom.coresystem.universal.event.LoadingEvent;
import vision.voltsofdoom.coresystem.universal.log.VODLog4J;

@Stowaway
public class GameRegistry {

	public GameRegistry() {
		VODLog4J.LOGGER.status("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
		VODLog4J.LOGGER.error("GameRegistry depopulated!");
	}

	public static void typeStowawayTestObject(Object notAnEvent) {

	}

	public static void typeStowawayTestNotEvent(String notAnEvent) {

	}

	@Stowaway
	public static void methodStowawayTest(LoadingEvent.TestEvent event) {
		VODLog4J.LOGGER.info("Volts of Doom Coregame (GameRegistry#methodStowawayTest) has heard a LoadingEvent.TestEvent Event!");
	}

	@Stowaway
	public static void bandWagonCreationEvent(LoadingEvent.BandWagonCreation event) {
		VODLog4J.LOGGER.info("Volts of Doom Coregame (GameRegistry#bandWagonCreationEvent) has heard the LoadingEvent.BandWagonCreation Event!");
	}
}
