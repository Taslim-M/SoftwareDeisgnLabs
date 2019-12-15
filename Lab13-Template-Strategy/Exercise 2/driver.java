package Ex2;

public class driver {
	public static void main(String[] args) {
		Ghost Ghost1= new Ghost();
		System.out.println("Moving the Ghost 5 times at slow Speed");
		for(int k =0;k<5;++k) {
			Ghost1.moveGhost();
		}
		//Medium
		System.out.println("Setting the Ghost Speed to Medium and Moving the Ghost 5 times at Medium Speed");
		Ghost1.setSpeedBehavior(new MediumGhostSpeedStrategy());
		for(int k =0;k<5;++k) {
			Ghost1.moveGhost();
		}
		//FAST
		System.out.println("Setting the Ghost Speed to Fast and Moving the Ghost 5 times at Fast Speed");
		Ghost1.setSpeedBehavior(new FastGhostSpeedStrategy());
		for(int k =0;k<5;++k) {
			Ghost1.moveGhost();
		}
		
		System.out.println("Ghost Disappaears :(");
	}
}
