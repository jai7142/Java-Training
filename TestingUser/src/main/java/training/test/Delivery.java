package training.test;


public class Delivery {

	private String deliveryId;
	private boolean completed;
	private double doubledeliveryTimeInHours;
	private double parcelWeight;
	private double revenue;

	public String getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public double getDoubledeliveryTimeInHours() {
		return doubledeliveryTimeInHours;
	}

	public void setDoubledeliveryTimeInHours(double doubledeliveryTimeInHours) {
		this.doubledeliveryTimeInHours = doubledeliveryTimeInHours;
	}

	public double getParcelWeight() {
		return parcelWeight;
	}

	public void setParcelWeight(double parcelWeight) {
		this.parcelWeight = parcelWeight;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public Delivery(
			String deliveryId,
			boolean completed,
			double doubledeliveryTimeInHours,
			double parcelWeight,
			double revenue) {
		super();
		this.deliveryId = deliveryId;
		this.completed = completed;
		this.doubledeliveryTimeInHours = doubledeliveryTimeInHours;
		this.parcelWeight = parcelWeight;
		this.revenue = revenue;
	}

}
