package first;

public class PracticeHW {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setMaxSpeed(90);
		v.setModelName("WagonR");
		v.setWheels(4);

		Car c = new Car(4, 78, "Tiago");
		c.setType("Small Car");
	}

}

class Vehicle {
	private int wheels;
	private int maxSpeed;
	private String modelName;

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}

class Car extends Vehicle {
	public Car(int wheels, int maxSpeed, String modelName) {
		setWheels(wheels);
		setMaxSpeed(maxSpeed);
		setModelName(modelName);
	}
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

class Truck extends Vehicle {
	private int maxCapacity;

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
}