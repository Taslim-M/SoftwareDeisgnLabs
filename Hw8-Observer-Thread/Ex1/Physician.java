package Ex1;

import java.util.Date;

public class Physician extends Doctor implements Observer {

	public Physician(String name) {
		super(name);
	}

	@Override
	public void update(Object o) {
		this.patientToTreat = (Patient)o;
		if(patientToTreat.temperature >102) {
			attendPatient();
		}
	}

	@Override
	public void attendPatient() {
		System.out.println("Physician examined " + patientToTreat.patientName
				+" " + patientToTreat.temperature + " " + (new Date()).toString() );
	}

}
