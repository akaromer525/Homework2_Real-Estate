
package akaromer.homew2;

public class Property {
    protected double area;
    protected int rooms;
    protected String neighborhood;
    protected double price;
    protected String houseNumber;

    public Property(double area, int rooms, String neighborhood, double price, String houseNumber) {
        this.area = area;
        this.rooms = rooms;
        this.neighborhood = neighborhood;
        this.price = price;
        this.houseNumber = houseNumber;
    }

    public void display() {
        System.out.println("House Number: " + houseNumber);
        System.out.println("Property Type: Property");
        System.out.println("Area: " + area + " m²");
        System.out.println("Rooms: " + rooms);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price: $" + price);
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
