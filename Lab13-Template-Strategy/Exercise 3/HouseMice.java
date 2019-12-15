package Ex3;

public class HouseMice extends Mice {

	@Override
	public void decideBehaviour(Cat cat) {
		// If cat awake- Jump
		if (cat.isAwake) {
			setReactBehaviour(new JumpingBehaviour());
		} else {
			// If cat sleeping - run away
			setReactBehaviour(new RunningBehaviour());
		}
	}
}
