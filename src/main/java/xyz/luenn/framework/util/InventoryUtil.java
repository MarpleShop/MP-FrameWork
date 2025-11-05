package xyz.luenn.framework.util;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

import java.util.Arrays;
import java.util.Objects;

public class InventoryUtil {
    public static Integer getSpace(Inventory inventory) {
        int filled = (int) Arrays.stream(inventory.getContents()).filter(Objects::nonNull).count();
        if (inventory instanceof PlayerInventory) {
            filled -= Arrays.stream(((PlayerInventory) inventory).getArmorContents()).filter(Objects::nonNull).count();
            if (((PlayerInventory) inventory).getItemInOffHand().getType() != Material.AIR) filled--;
        }
        return inventory.getSize() - filled;
    }
}
