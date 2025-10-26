public class Desktop {
    // Private instance variables
    private String brand;
    private String processor;
    private int ramSize; // in GB

    // Constructor
    public Desktop(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
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

    // Getter and Setter for processor
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        if (processor != null && !processor.trim().isEmpty()) {
            this.processor = processor;
        } else {
            System.out.println("Invalid processor name. It cannot be empty.");
        }
    }

    // Getter and Setter for ramSize
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        if (ramSize >= 0) {
            this.ramSize = ramSize;
        } else {
            System.out.println("Invalid RAM size. It cannot be negative.");
        }
    }

    // Method to upgrade RAM
    public void upgradeRam(int extraRam) {
        if (extraRam > 0) {
            ramSize += extraRam;
            System.out.println("RAM upgraded by " + extraRam + "GB. New RAM size: " + ramSize + "GB.");
        } else {
            System.out.println("Invalid value. Extra RAM must be positive.");
        }
    }

    // Method to display desktop details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + "GB");
    }

    // Main method to test the Desktop class
    public static void main(String[] args) {
        Desktop d1 = new Desktop("Dell", "Intel Core i7", 8);

        d1.displayInfo();
        System.out.println();

        d1.upgradeRam(8);   // valid upgrade
        d1.upgradeRam(-4);  // invalid upgrade

        System.out.println();
        d1.displayInfo();
    }
}
