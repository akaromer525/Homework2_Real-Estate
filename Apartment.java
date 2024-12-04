
package akaromer.homew2;

public class Apartment extends Property {
    private int floor;
    private boolean hasParking;

    public Apartment(double area, int rooms, String neighborhood, double price, String houseNumber, int floor, boolean hasParking) {
        super(area, rooms, neighborhood, price, houseNumber);
        this.floor = floor;
        this.hasParking = hasParking;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Floor: " + floor);
        System.out.println("Has Parking: " + (hasParking ? "Yes" : "No"));
    }
}
