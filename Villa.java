
package akaromer.homew2;

public class Villa extends Property {
    private boolean hasSwimmingPool;
    private int adjacentStreets;

    public Villa(double area, int rooms, String neighborhood, double price, String houseNumber, boolean hasSwimmingPool, int adjacentStreets) {
        super(area, rooms, neighborhood, price, houseNumber);
        this.hasSwimmingPool = hasSwimmingPool;
        this.adjacentStreets = adjacentStreets;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Has Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
        System.out.println("Adjacent Streets: " + adjacentStreets);
    }
}

