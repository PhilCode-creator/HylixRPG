package eu.hylix.hylixrpg;

import eu.hylix.mysql.api.MySQLAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RPG extends JavaPlugin {

    public static String prefix = "§8[§3RPG§8] §r";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(prefix + "§aAktiviert");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(prefix + "§cDeaktiviert");
    }

    private void register() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        MySQLAPI.getMySQL().executeStatement("");
    }

}
