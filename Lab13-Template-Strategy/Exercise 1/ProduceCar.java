package Ex1;

public class ProduceCar extends ToyFactory {

	@Override
	void fixMold() {
		System.out.println("Fix the mold for producing Car");
	}

	@Override
	void coolProducts() {
		System.out.println("Cool the Car product for 1 minute");
	}

	@Override
	void fixWheels() {
		System.out.println("Fix 4 wheels - 2 in the front axle and 2 in the back axle to the car product");
	}

	@Override
	void packProduct() {
		System.out.println("Pack the Car product");
	}

}
