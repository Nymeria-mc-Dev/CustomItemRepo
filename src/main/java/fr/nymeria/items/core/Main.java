package fr.nymeria.items.core;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ConsoleCommandSender console = Bukkit.getConsoleSender();

        console.sendMessage("§a==================== Items ====================");
        console.sendMessage("");
        console.sendMessage("§a  => Enabling Main class !");
        console.sendMessage("");
        console.sendMessage("§a===============================================");

    }
}
