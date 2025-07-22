package Generics.Smart_Warehouse_Management_System;

public class Electronics extends WarehouseItem {
    private int warrantyMonths;

    public Electronics(String name, int warrantyMonths) {
        super(name);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + ", Warranty: " + warrantyMonths + " months";
    }
}

