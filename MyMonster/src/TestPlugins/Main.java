package TestPlugins;

import org.bukkit.Location;
import org.bukkit.World;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_10_R1.WorldGenRegistration.WorldGenWitchHut;

import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.Monster;
import org.bukkit.entity.EntityType;
//import org.bukkit.entity.spawnEntity;

public class Main extends JavaPlugin {
	
	@Override
    public void onEnable() {
       
    }
   
    @Override
    public void onDisable() {
       
    }
    @Override
    public boolean onCommand(CommandSender sender,
    		Command command,
    		String label,
    		String[] args) {
    	if(command.getName().equalsIgnoreCase("testCmd")) {
    		sender.sendMessage("Spawn Monster !!");
    		Player _p = sender.getServer().getPlayer(args[0]);
    		World _w = _p.getLocation().getWorld();
    		_w.spawnEntity(_p.getLocation(), EntityType.ZOMBIE);
    		return true;
    	}
    	sender.sendMessage("On Command !!");
    	return false;
	}
}
