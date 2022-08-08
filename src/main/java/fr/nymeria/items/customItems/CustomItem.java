package fr.nymeria.items.customItems;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface CustomItem {

    ItemStack getItem();

    void setDurability(int durability);

    void setName(String name);

    void setCount(int count);

    default void giveItemStack(@NotNull Player player) {
        player.getInventory().addItem(this.getItem());
    }

    void onRightClick(Player player);

    void onLeftClick(Player player);

    void openGUI(Player player);

    void onUse(Player player);

}