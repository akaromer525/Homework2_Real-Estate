
package akaromer.homew2;

public class RealEstateAgency {
    private Property[] properties;
    private int propertyCount;

    public RealEstateAgency() {
        properties = new Property[100];
        propertyCount = 0;
    }

    public void addProperty(Property property) {
        if (propertyCount < 100) {
            properties[propertyCount++] = property;
            System.out.println("Property added successfully!\n");
        } else {
            System.out.println("Cannot add more properties. Maximum limit reached.");
        }
    }

    public void removeProperty(String houseNumber) {
        boolean found = false;
        for (int i = 0; i < propertyCount; i++) {
            if (properties[i].getHouseNumber().equals(houseNumber)) {
                for (int j = i; j < propertyCount - 1; j++) {
                    properties[j] = properties[j + 1];
                }
                properties[propertyCount - 1] = null;
                propertyCount--;
                System.out.println("Property with House Number " + houseNumber + " has been sold and removed from the list.\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Property with House Number " + houseNumber + " not found.\n");
        }
    }

    public void displayProperties() {
        if (propertyCount == 0) {
            System.out.println("No properties available.");
        } else {
            for (int i = 0; i < propertyCount; i++) {
                properties[i].display();
                System.out.println();
            }
        }
    }
}

