package day2;

public interface Engine {
      void EngineType();
      
}
interface Fuel{
	  void FuelType();
}

class Car implements Fuel,Engine{
	public void EngineType() {
		System.out.println("Engine Used in car is String HorsePower");
	}
	public void FuelType() {
		System.out.println("Car can uses both Petrol and Disel");
	}
}
class Bike implements Fuel,Engine{
	public void EngineType() {
		System.out.println("Engine Used in car is Low HorsePower Compared to Car");
	}
	public void FuelType() {
		System.out.println("Bike can uses both Petrol");
	}
}