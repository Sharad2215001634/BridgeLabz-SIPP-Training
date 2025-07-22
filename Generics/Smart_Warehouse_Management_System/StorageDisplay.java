package Generics.Smart_Warehouse_Management_System;

import java.util.List;

public class StorageDisplay {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

