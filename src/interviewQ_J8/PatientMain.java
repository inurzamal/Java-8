package interviewQ_J8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PatientMain {

	public static void main(String[] args) {
		
		List<Patient> patient = new ArrayList<Patient>();
		
		patient.add(new Patient("Raju",25, "cold",500));
		patient.add(new Patient("Raja",28, "covid",2000));
		patient.add(new Patient("kaju",35, "fever",600));
		patient.add(new Patient("Gitanjali",25, "covid",900));		
		
		List<Patient> covidPatient = 
				patient.stream().filter(p->p.getDiseases().equals("covid") && p.getAge()<=25).collect(Collectors.toList());
		
		covidPatient.forEach(i->System.out.println(i.getName()+ " " +i.getDiseases()));
		
// **********************
		Double averageBill = patient.stream().filter(p->p.getDiseases().equals("covid")).collect(Collectors.averagingDouble(Patient::getBillAmount));
		
		System.out.println("Average Bill of Covid Patient: "+ averageBill);
		
	}
}
