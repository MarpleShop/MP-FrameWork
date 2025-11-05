package xyz.luenn.framework;

import org.bukkit.plugin.java.JavaPlugin;

public final class MarpleFrameWork extends JavaPlugin {

    private static MarpleFrameWork instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MarpleFrameWork getInstance() {
        return instance;
    }
}
