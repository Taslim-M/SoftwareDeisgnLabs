package Ex1;

public abstract class ToyFactory {
	final void ProduceToy() {
		fixMold();
		feedRawMaterial();
		heatRawMaterial();
		injectRawMaterial();
		coolProducts();
		fixWheels();
		packProduct();
	}
	
	abstract void fixMold();
	void feedRawMaterial() {
		System.out.println("Feed poly vinyl chloride powder to the machine");
	}
	void heatRawMaterial() {
		System.out.println("Heat raw material to 500 degree centrigrade");
	}
	void injectRawMaterial() {
		System.out.println("Inject heated raw material into the mold");
	}
	abstract void coolProducts();
	abstract void fixWheels();
	abstract void packProduct();
	
}
