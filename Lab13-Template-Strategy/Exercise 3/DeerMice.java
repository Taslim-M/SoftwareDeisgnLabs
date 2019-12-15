package Ex3;

public class DeerMice extends Mice {

	@Override
	public void decideBehaviour(Cat cat) {
		//If cat awake- Run awayy
		if(cat.isAwake) {
			setReactBehaviour(new RunningBehaviour());
		}else {
			//If cat sleeping - jump up/down
			setReactBehaviour(new JumpingBehaviour());
		}
	}

}
