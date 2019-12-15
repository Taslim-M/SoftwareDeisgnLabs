package Ex3;

public class RunningBehaviour implements ReactBehaviour {

	@Override
	public void react(Mice mice,Cat cat) {
		System.out.println(mice.toString()+" is running away from cat " +
	cat.toString());
	}

}
