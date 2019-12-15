package Ex3;

public abstract class Mice {
	ReactBehaviour reactToCat;
	final public void spotCat(Cat cat) {
		seeCat(cat);
		decideBehaviour(cat);
		reactToCat(cat);
	}
	//Concrete method
	private void seeCat(Cat cat) {
		System.out.println(this.toString() +" mouse looking ernestly at cat" + cat.toString()
		+" who is " + cat.status());
	}
	private void reactToCat(Cat cat) {
		reactToCat.react(this,cat);
	}
	public abstract void decideBehaviour(Cat cat);
	public void setReactBehaviour(ReactBehaviour react) {
		this.reactToCat=react;
	}
}
