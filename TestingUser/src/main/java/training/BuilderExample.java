package training;


class Shipment {

	private String destination;
	private String shipmentType;
	private String shippingDate;
	private String trackingNumber;
	private boolean insurance;
	private boolean giftWrap;

	@Override
	public String toString() {
		return "Shipment{" + "destination='" + destination + '\'' + ", shipmentType='" + shipmentType + '\''
				+ ", shippingDate='" + shippingDate + '\'' + ", trackingNumber='" + trackingNumber + '\'' + ", insurance="
				+ insurance + ", giftWrap=" + giftWrap + '}';
	}

	// Private constructor to enforce object creation through Builder
	private Shipment(ShipmentBuilder builder) {
		this.destination = builder.destination;
		this.shipmentType = builder.shipmentType;
		this.shippingDate = builder.shippingDate;
		this.trackingNumber = builder.trackingNumber;
		this.insurance = builder.insurance;
		this.giftWrap = builder.giftWrap;
	}

	static class ShipmentBuilder {

		private String destination;
		private String shipmentType;
		private String shippingDate;
		private String trackingNumber;
		private boolean insurance;
		private boolean giftWrap;

		// Mandatory fields via constructor
		public ShipmentBuilder(String destination, String shipmentType, String shippingDate) {
			this.destination = destination;
			this.shipmentType = shipmentType;
			this.shippingDate = shippingDate;
		}

		// Optional fields via setters
		public ShipmentBuilder setTrackingNumber(String trackingNumber) {
			this.trackingNumber = trackingNumber;
			return this; // Return the builder instance for method chaining
		}

		public ShipmentBuilder setInsurance(boolean insurance) {
			this.insurance = insurance;
			return this;
		}

		public ShipmentBuilder setGiftWrap(boolean giftWrap) {
			this.giftWrap = giftWrap;
			return this;
		}

		// Build method to create the final Shipment object
		public Shipment build() {
			return new Shipment(this);
		}
	}

	public static void main(String[] args) {
		// Building a shipment with all attributes
		Shipment shipment = new Shipment.ShipmentBuilder("New York", "Overnight", "2024-11-25")
				.setTrackingNumber("TRACK123456789")
				.setInsurance(true)
				.setGiftWrap(true)
				.build();

		System.out.println(shipment);

		// Building another shipment with a different configuration (no insurance and gift wrap)
		Shipment shipment2 = new Shipment.ShipmentBuilder("Los Angeles", "Standard", "2024-11-28")
				.setTrackingNumber("TRACK987654321")
				.build();

		System.out.println(shipment2);
	}

}