public class Smartphone {
    // Private instance variables
    private String brand;
    private String model;
    private int storageCapacity; // in GB

    // Constructor
    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand name. It cannot be empty.");
        }
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Invalid model name. It cannot be empty.");
        }
    }

    // Getter and Setter for storageCapacity
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity >= 0) {
            this.storageCapacity = storageCapacity;
        } else {
            System.out.println("Invalid storage capacity. It cannot be negative.");
        }
    }

    // Method to increase storage capacity
    public void increaseStorage(int extraStorage) {
        if (extraStorage > 0) {
            storageCapacity += extraStorage;
            System.out.println("Storage increased by " + extraStorage + "GB. New capacity: " + storageCapacity + "GB.");
        } else {
            System.out.println("Invalid amount. Extra storage must be positive.");
        }
    }

    // Method to display smartphone details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }

    // Main method to test the class
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 128);

        phone.displayInfo();
        System.out.println();

        phone.increaseStorage(64);
        phone.increaseStorage(-10); // Invalid case

        System.out.println();
        phone.displayInfo();
    }
}
