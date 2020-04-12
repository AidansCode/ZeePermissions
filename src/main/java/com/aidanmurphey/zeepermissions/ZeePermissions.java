package com.aidanmurphey.zeepermissions;

import com.aidanmurphey.zeepermissions.listeners.Listeners;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZeePermissions extends JavaPlugin {

	/*
	 * STATIC LOGIC
	 */

	private static ZeePermissions plugin;
	public static ZeePermissions getPlugin() {
		return plugin;
	}

	/*
	 * INSTANCE LOGIC
	 */

	@Override
	public void onEnable() {
		plugin = this;
		Listeners.initializeListeners();

		PluginDescriptionFile pluginDescriptionFile = getDescription();
		getLogger().info(pluginDescriptionFile.getName() + " has been enabled!");
	}

}
