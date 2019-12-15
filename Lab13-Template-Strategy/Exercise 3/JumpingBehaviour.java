package Ex3;

public class JumpingBehaviour implements ReactBehaviour {

	@Override
	public void react(Mice mice,Cat cat) {
		System.out.println(mice.toString()+" is jumping up and down after looking at cat " +
	cat.toString());
	}

}
