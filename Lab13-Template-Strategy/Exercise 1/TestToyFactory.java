package Ex1;

public class TestToyFactory {
	public static void main(String[] args) {
		ToyFactory tf;
		tf = new ProduceCar();
		tf.ProduceToy();
		tf = new ProduceTruck();
		tf.ProduceToy();
	}
}
