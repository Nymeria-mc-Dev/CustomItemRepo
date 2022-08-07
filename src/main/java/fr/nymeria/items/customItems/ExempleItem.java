package fr.nymeria.items.customItems;

import fr.nymeria.items.Modifier.AttributeHelper;
import org.bukkit.Material;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ExempleItem implements CustomItem{

    int durability = 0;
    String name;
    int count = 1;
    private ItemStack item = new ItemStack(Material.NETHERITE_SWORD, count);

    @Override
    public ItemStack getItem() {
        AttributeHelper.setMovementSpeed(EquipmentSlot.OFF_HAND, 100);
        AttributeHelper.setAttackSpeed(EquipmentSlot.HAND, 15);

        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(5);
        item.setItemMeta(meta);

        if(durability != 0) item.setDurability((short) durability);
        if(name != null) meta.setDisplayName(name);

        return item;
    }

    @Override
    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }
}
