package training;



//Step 1: Define the Shipment interface
interface Shipment1 {
void deliver();
}

//Step 2: Create concrete classes for different shipment types
class AirShipment implements Shipment1 {
@Override
public void deliver() {
   System.out.println("Delivering by air.");
}
}

class SeaShipment implements Shipment1 {
@Override
public void deliver() {
   System.out.println("Delivering by sea.");
}
}

class LandShipment implements Shipment1 {
@Override
public void deliver() {
   System.out.println("Delivering by land.");
}
}

//Step 3: Create a ShipmentFactory class
class ShipmentFactory {
// Factory method to create Shipment objects
public static Shipment1 createShipment(String shipmentType) {
   switch (shipmentType.toLowerCase()) {
       case "air":
           return new AirShipment();
       case "sea":
           return new SeaShipment();
       case "land":
           return new LandShipment();
       default:
           throw new IllegalArgumentException("Invalid shipment type: " + shipmentType);
   }
}
}

//Step 4: Demonstrate the Factory Pattern in action
public class FactoryPattern {
public static void main(String[] args) {
   // Create different shipments using the factory
		Shipment1 airShipment = ShipmentFactory.createShipment("air");
		Shipment1 seaShipment = ShipmentFactory.createShipment("sea");
		Shipment1 landShipment = ShipmentFactory.createShipment("land");

   // Deliver the shipments
   airShipment.deliver();
   seaShipment.deliver();
   landShipment.deliver();
}
}
