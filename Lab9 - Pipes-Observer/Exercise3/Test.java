package Ex3;

public class Test {

	public static void main(String[] args) {
		Faculty f1 = new Faculty("Dr. Imran");
		Faculty f2 = new Faculty("Dr. Ali");
		Student s1 = new Student("Ahmed");
		Student s2 = new Student("Mohammed");
		f1.registerObserver(s1);
		f1.registerObserver(s2);
		f1.newAnnouncement(new Course("COE 312", "Fall 2019"));
		f2.registerObserver(s1);
		f2.registerObserver(s2);
		f2.newAnnouncement(new Course("COE 331", "Fall 2019"));
	}
}