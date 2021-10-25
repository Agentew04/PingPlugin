package io.github.agentew04.pingplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args==null || args.length==0){
            //proprio player
            if(sender instanceof Player){
                Player player = (Player) sender;
                sender.sendMessage(ChatColor.GREEN+"O seu ping é: "+ChatColor.YELLOW+player.getPing());
            }else{
                return false;
            }
            return true;
        }else {
            //outro player
            Player player = Bukkit.getPlayer(args[0]);
            if(player==null){
                sender.sendMessage(ChatColor.DARK_RED+"Jogador não encontrado!");
                return true;
            }
            sender.sendMessage(ChatColor.GREEN+"O ping de "+ChatColor.YELLOW+player.getName()+ChatColor.GREEN +" é: "+ChatColor.YELLOW+player.getPing());
            return true;
        }
    }
}
