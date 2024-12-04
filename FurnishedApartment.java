
package akaromer.homew2;

public class FurnishedApartment extends Property {
    private int furnitureQuality;

    public FurnishedApartment(double area, int rooms, String neighborhood, double price, String houseNumber, int furnitureQuality) {
        super(area, rooms, neighborhood, price, houseNumber);
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Furniture Quality: " + furnitureQuality);
    }
}
