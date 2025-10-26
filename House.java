public class House {
    // Private instance variables
    private String address;
    private int numberOfRooms;
    private double area; // in square meters

    // Constructor
    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("Invalid address. It cannot be empty.");
        }
    }

    // Getter and Setter for numberOfRooms
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if (numberOfRooms > 0) {
            this.numberOfRooms = numberOfRooms;
        } else {
            System.out.println("Invalid number of rooms. It must be positive.");
        }
    }

    // Getter and Setter for area
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        } else {
            System.out.println("Invalid area. It must be positive.");
        }
    }

    // Method to calculate price based on area and price per square meter
    public double calculatePrice(double pricePerSquareMeter) {
        if (pricePerSquareMeter > 0) {
            return area * pricePerSquareMeter;
        } else {
            System.out.println("Invalid price per square meter.");
            return 0;
        }
    }

    // Method to display house details
    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Area: " + area + " sq. meters");
    }

    // Main method to test the House class
    public static void main(String[] args) {
        House h1 = new House("123 Green Street, Dhaka", 4, 150.0);

        h1.displayInfo();
        System.out.println();

        double pricePerSquareMeter = 7500.0;
        double totalPrice = h1.calculatePrice(pricePerSquareMeter);

        System.out.println("Price per square meter: " + pricePerSquareMeter + " BDT");
        System.out.println("Total House Price: " + totalPrice + " BDT");
    }
}
