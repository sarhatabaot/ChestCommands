/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.chestcommands.icon;

import me.filoghost.fcommons.Strings;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

public class IconPermission {
    private List<String> permissions;

    public IconPermission(List<String> permissions) {
        this.permissions = permissions.stream().map(String::trim).collect(Collectors.toList());
    }

    private boolean hasPermission(Player player) {
        if (permissions.isEmpty())
            return false;

        for (String permission : permissions) {
            if (permission.contains("-")) {
                if (player.hasPermission(permission.substring(1))) {
                    return false;
                }
                continue;
            }
            if (!player.hasPermission(permission)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.permissions == null;
    }

    public static boolean hasPermission(Player player, IconPermission permission) {
        return permission == null || permission.hasPermission(player);
    }

}
