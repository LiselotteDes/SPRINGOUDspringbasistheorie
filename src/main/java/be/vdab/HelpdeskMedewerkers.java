package be.vdab;

//import java.util.Map;
import java.util.Properties;

//import java.util.Arrays;
//import java.util.List;
//import java.util.Set;

// *** Een array, List of Set / Map injecteren ***
class HelpdeskMedewerkers {

	//private String[] namen;						// array
	//private List<String> namen;					// List
	//private Set<String> namen;					//Set
	//private Map<String, Integer> medewerkers;		//Map
	// key = naam medewerker, value = intern telefoonnummer
	private Properties medewerkers;					// Properties
	
	//public void setNamen(/*String[]*/ /*List*/Set<String> namen) {
		//this.namen = namen;
	//}
	
	HelpdeskMedewerkers(/*Map<String, Integer>*/Properties medewerkers) {
		this.medewerkers = medewerkers;
	}
	
	@Override
	public String toString() {
		//return Arrays.toString(namen);
		//return namen.toString();
		return medewerkers.toString();
	}
	
}
