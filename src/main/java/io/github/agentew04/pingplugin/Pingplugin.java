package io.github.agentew04.pingplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Pingplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.AQUA+"FUI ATIVADO!");
        Objects.requireNonNull(this.getCommand("ping")).setExecutor(new Pingplugin());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(ChatColor.AQUA+"ESTOU SENDO DESLIGADO!");
    }
}
