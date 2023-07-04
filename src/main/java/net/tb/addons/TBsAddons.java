package net.tb.addons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TBsAddons implements ModInitializer {
	public static final String MOD_ID = "tbs-addons";
    public static final Logger LOGGER = LoggerFactory.getLogger("tbs-addons");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}