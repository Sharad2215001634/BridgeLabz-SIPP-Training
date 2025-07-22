package Generics.Smart_Warehouse_Management_System;

public class Warehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 24));
        electronicsStorage.addItem(new Electronics("Smartphone", 12));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", "2025-08-10"));
        groceriesStorage.addItem(new Groceries("Bread", "2025-07-25"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("=== Electronics ===");
        StorageDisplay.displayItems(electronicsStorage.getAllItems());

        System.out.println("\n=== Groceries ===");
        StorageDisplay.displayItems(groceriesStorage.getAllItems());

        System.out.println("\n=== Furniture ===");
        StorageDisplay.displayItems(furnitureStorage.getAllItems());
    }
}
