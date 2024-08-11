package lu.kolja.ultraapi;

import dev.triumphteam.gui.components.GuiAction;
import dev.triumphteam.gui.guis.GuiItem;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
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
    public GuiItem guiItemBuilder(Material material, String name, int amount, @Nullable List<String> lore, GuiAction<InventoryClickEvent> lambda) {
        return GuiUtil.itemBuilder(material, name, amount, lore, lambda);
    }
}
