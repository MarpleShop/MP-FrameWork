package xyz.luenn.framework.util;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class PlayerUtil {
    public static OfflinePlayer getOfflinePlayer(@NotNull String name) {

        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(name);
        if (!(offlinePlayer.hasPlayedBefore() || offlinePlayer.isOnline())) return null;
        return offlinePlayer;
    }
}
