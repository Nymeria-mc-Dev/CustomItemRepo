package fr.nymeria.items.customItems;

import org.bukkit.inventory.ItemStack;

public interface CustomItem {

    ItemStack getItem();

    void setDurability(int durability);

    void setName(String name);

    void setCount(int count);

}
