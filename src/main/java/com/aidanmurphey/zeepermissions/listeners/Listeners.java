package com.aidanmurphey.zeepermissions.listeners;

import com.aidanmurphey.zeepermissions.ZeePermissions;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class Listeners {

    public static void initializeListeners() {
        ZeePermissions plugin = ZeePermissions.getPlugin();
        PluginManager pluginManager = plugin.getServer().getPluginManager();
        for(Class c : getListeners()) {
            try {
                Listener listener = (Listener) c.newInstance();
                pluginManager.registerEvents(listener, plugin);
            } catch (Exception e) {}
        }
    }

    private static Class[] getListeners() {
        return new Class[] {
            SetupPermissionsOnConnectionListener.class
        };
    }

}
