package Ex3;

public class Student implements Observer {
	String sName;
	public Student(String sName) {
		this.sName= sName;
	}
	
	@Override
	public void update(Object o) {
		System.out.println("Student "+ sName + " received announcement from faculty");
	}

}
