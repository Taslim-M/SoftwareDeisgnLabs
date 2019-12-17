package Ex1;

import java.util.Date;

public class Endocrinologist extends Doctor implements Observer {
	public Endocrinologist(String name) {
		super(name);
	}

	@Override
	public void update(Object o) {
		this.patientToTreat = (Patient) o;
		if (patientToTreat.temperature < 98) {
			attendPatient();
		}
	}

	@Override
	public void attendPatient() {
		System.out.println( "Endocrinologist examined " + patientToTreat.patientName + " "
				+ patientToTreat.temperature + " " + (new Date()).toString());
	}

}
