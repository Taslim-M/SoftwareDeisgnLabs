package Ex3;

public class driver {
	public static void main(String[] args) {
		System.out.println("Generating a sleeping cat and 2 mices");
		Cat cat = new Cat();
		cat.sleepCat();
		Mice deerMice = new DeerMice();
		Mice houseMice = new HouseMice();
		deerMice.spotCat(cat);
		houseMice.spotCat(cat);
		//===================================
		System.out.println("Waking Up cat");
		cat.awakeCat();
		deerMice.spotCat(cat);
		houseMice.spotCat(cat);
		
	}
}
