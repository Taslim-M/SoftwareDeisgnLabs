package Ex1;

public class ProduceTruck extends ToyFactory {

	@Override
	void fixMold() {
		System.out.println("Fix the mold for producing Truck");
	}

	@Override
	void coolProducts() {
		System.out.println("Cool the Truck product for 2 minutes");
	}

	@Override
	void fixWheels() {
		System.out.println("Fix six wheels - 2 in the front axle and 4 in the back axle to the truck product");
	}

	@Override
	void packProduct() {
		System.out.println("Pack the Truck product");
	}

}
