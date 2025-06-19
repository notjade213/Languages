package notjade.languages.Main;

import notjade.languages.Listeners.ChatListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Languages extends JavaPlugin {
    public static Languages plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info(plugin + " has started");

        // Register Listener
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);



    }

    @Override
    public void onDisable() {
        getLogger().info(plugin + " has been disabled");
    }
}
