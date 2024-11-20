package training;


public class CargoSystom {

	// Instance Variables
	private String cargoId;
	private String description;
	private int weight;

	private double perWeightPrice = 1;
	private double perDistancePrice = 10;

	// Constructor
	public CargoSystom(String cargoId, String description, int weight) {
      this.cargoId = cargoId;
      this.description = description;
      this.weight = weight;
  }

	// Method to display cargo details
	public void displayDetails() {
		System.out.println("Cargo ID: " + cargoId + ", Description: " + description + ", Weight: " + weight);
	}

	/*	Step 2: Instance Variables and Methods
		Task: Modify the Cargo class to include additional instance variables and methods that suit the air cargo system.
		Example: Add a method to calculate shipping cost based on weight and distance.*/
	public double calculateShipmentValue(double weight, double distance) {

		return (this.perDistancePrice * distance) + (this.perWeightPrice * weight);
	}

	// Object Creation
	public static void main(String[] args) {
		/*	2. Understanding Classes and Objects
			Step 1: Class Definition and Object Creation
			Task: Create a Cargo class to represent cargo items in the air cargo system.*/
		CargoSystom cargo1 = new CargoSystom("C001", "Electronics", 100);
		cargo1.displayDetails();


	}

}
