package com.github.pigsteel.materials.platform;

public interface Platform {
	boolean isModLoaded(String modId);

	boolean isDevelopmentEnvironment();

	default boolean isDebug() {
		return isDevelopmentEnvironment();
	}
}
