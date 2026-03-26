package infloat.holdtosprint;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HoldToSprint implements ModInitializer {
	public static final String MOD_ID = "hold-to-sprint";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hold to Sprint Initialized");
	}
}