package in.joelurw.AntiGoldDrops;
import org.bukkit.plugin.java.JavaPlugin;


public class AntiGoldDrops extends JavaPlugin
{
    private static AntiGoldDrops instance;

    @Override
    public void onEnable()
    {
        instance = this;
        getServer().getPluginManager().registerEvents(new EntityDeathHandler(), this);
    }

    @Override
    public void onDisable()
    {

    }
    public static void log(String message)
    {
        instance.getServer().getLogger().info(message);
    }
}
