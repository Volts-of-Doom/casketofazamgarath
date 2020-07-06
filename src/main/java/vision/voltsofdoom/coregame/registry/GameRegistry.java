package vision.voltsofdoom.coregame.registry;

import vision.voltsofdoom.coresystem.universal.band_wagon.Event;
import vision.voltsofdoom.coresystem.universal.band_wagon.Stowaway;
import vision.voltsofdoom.coresystem.universal.log.VODLog4J;

@Stowaway
public class GameRegistry {

	public GameRegistry() {
		VODLog4J.LOGGER.status("Found Volts Of Doom (coregame) GameRegistry successfully. Let's load some registries!");
		VODLog4J.LOGGER.error("GameRegistry depopulated!");
	}

	public static void typeStowawayTest() {

	}

	@Stowaway
	public static void methodStowawayTest(Event event) {

	}
}
