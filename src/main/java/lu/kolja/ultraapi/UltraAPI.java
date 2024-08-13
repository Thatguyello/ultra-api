package lu.kolja.ultraapi;

import dev.triumphteam.gui.components.GuiAction;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import dev.triumphteam.gui.guis.PaginatedGui;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class UltraAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static GuiItem guiItemBuilder(Material material, String name, int amount, @Nullable List<String> lore, GuiAction<InventoryClickEvent> lambda) {
        return GuiUtil.itemBuilder(material, name, amount, lore, lambda);
    }
    public static Gui guiBuilder(TextComponent title, int rows) {
        return GuiUtil.guiBuilder(title, rows);
    }
    public static PaginatedGui pagedGuiBuilder(TextComponent title, int rows) {
        return GuiUtil.pagedGuiBuilder(title, rows);
    }
    public static String chatFormatter(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
    public static void registerEvents(Plugin pl, Listener... listener) {
        for (Listener l : listener) {
            pl.getServer().getPluginManager().registerEvents(l, pl);
        }
    }

}
