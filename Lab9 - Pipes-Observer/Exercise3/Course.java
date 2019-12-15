package Ex3;

public class Course{
	String cName;
	String sem;
	public String getcName() {
		return cName;
	}
	private void setcName(String cName) {
		this.cName = cName;
	}
	public String getSem() {
		return sem;
	}
	private void setSem(String sem) {
		this.sem = sem;
	}
	public Course(String cName, String sem) {
		this.cName= cName;
		this.sem = sem;
	}
}