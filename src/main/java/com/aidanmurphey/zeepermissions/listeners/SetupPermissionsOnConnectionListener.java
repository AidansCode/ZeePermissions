package com.aidanmurphey.zeepermissions.listeners;

import com.aidanmurphey.zeepermissions.ZeePermissions;
import com.aidanmurphey.zeepermissions.permissions.PermissionsManager;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class SetupPermissionsOnConnectionListener implements Listener {

    public void onPlayerJoin(PlayerJoinEvent e) {
        System.out.println("Someone joined");
        PermissionsManager.getInstance().register(e.getPlayer());
    }

    public void onPlayerLeave(PlayerQuitEvent e) {
        PermissionsManager.getInstance().remove(e.getPlayer());
    }

}
