package Ex1;

public abstract class Doctor {
	public Patient patientToTreat;
	public String docName;
	public Doctor(String name){
		this.docName = name;
	}
	public abstract void attendPatient();
}
