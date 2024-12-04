
package akaromer.homew2;

import java.util.Scanner;

public class AkaromerHomew2 {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        RealEstateAgency agency = new RealEstateAgency();

        while (true) {
            System.out.println("Real Estate Agency");
            System.out.println("1. Add Property");
            System.out.println("2. Display All Properties");
            System.out.println("3. Remove Property (Sold) by House Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Enter Property Details");

                System.out.print("House Number: ");
                String houseNumber = scanner.nextLine();

                System.out.print("Area (m²): ");
                double area = scanner.nextDouble();

                System.out.print("Number of Rooms: ");
                int rooms = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Neighborhood: ");
                String neighborhood = scanner.nextLine();

                System.out.print("Price ($): ");
                double price = scanner.nextDouble();

                System.out.println("Choose property type: ");
                System.out.println("1. Villa");
                System.out.println("2. Apartment");
                System.out.println("3. Furnished Apartment");
                int propertyType = scanner.nextInt();

                Property property = null;

                if (propertyType == 1) {
                    System.out.print("Has Swimming Pool (Yes/No): ");
                    boolean hasSwimmingPool = scanner.nextBoolean();

                    System.out.print("Number of Adjacent Streets: ");
                    int adjacentStreets = scanner.nextInt();
                    property = new Villa(area, rooms, neighborhood, price, houseNumber, hasSwimmingPool, adjacentStreets);
                } else if (propertyType == 2) {
                    System.out.print("Floor Number: ");
                    int floor = scanner.nextInt();

                    System.out.print("Has Parking (Yes/No): ");
                    boolean hasParking = scanner.nextBoolean();
                    property = new Apartment(area, rooms, neighborhood, price, houseNumber, floor, hasParking);
                } else if (propertyType == 3) {
                    System.out.print("Furniture Quality (1 to 5): ");
                    int furnitureQuality = scanner.nextInt();
                    property = new FurnishedApartment(area, rooms, neighborhood, price, houseNumber, furnitureQuality);
                }

                if (property != null) {
                    agency.addProperty(property);
                }
            } else if (choice == 2) {
                agency.displayProperties();
            } else if (choice == 3) {
                System.out.print("Enter the house number of the property to remove: ");
                String houseNumber = scanner.nextLine();
                agency.removeProperty(houseNumber);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    
 }
    
}
