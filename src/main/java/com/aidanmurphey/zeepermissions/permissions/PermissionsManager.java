package com.aidanmurphey.zeepermissions.permissions;

import com.aidanmurphey.zeepermissions.ZeePermissions;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import java.util.HashMap;
import java.util.UUID;

public class PermissionsManager {

    /*
     * STATIC LOGIC
     */
    private static PermissionsManager instance;
    public static PermissionsManager getInstance() {
        if (instance == null)
            instance = new PermissionsManager();

        return instance;
    }

    /*
     * INSTANCE LOGIC
     */
    private HashMap<UUID, PermissionAttachment> permissionAttachments;
    private PermissionsManager() {
        permissionAttachments = new HashMap<>();
    }

    public void register(Player p) {
        PermissionAttachment attachment = p.addAttachment(ZeePermissions.getPlugin());
        permissionAttachments.put(p.getUniqueId(), attachment);
    }

    public void remove(Player p) {
        permissionAttachments.remove(p.getUniqueId());
    }

}
