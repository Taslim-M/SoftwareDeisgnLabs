import java.util.Random;

public class q3 {

	public static void main(String[] args) {
		Robot robot1 = new Robot("walking", "First");
		Robot robot2 = new Robot("sleeping", "Second");
		Robot robot3 = new Robot("sitting", "Third");
	}
	
}
class Robot implements Runnable{
	private String task;
	private Thread thread;
	public Robot(String task, String threadName){
		this.task =  task;
		thread = new Thread(this);
		thread.setName(threadName);
		thread.start();
	}
	@Override
	public void run() {
		try {
			thread.sleep(1000+new Random().nextInt(4000)); // sleep randomly b/w 1 to 5 sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +" Thread " +" Is Active");
		System.out.println("Robot is " + task);
	}
	
}