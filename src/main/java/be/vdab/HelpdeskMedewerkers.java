package be.vdab;

//import java.util.Arrays;
//import java.util.List;
import java.util.Set;

// *** Een array, List of Set injecteren ***
class HelpdeskMedewerkers {

	//private String[] namen;		// array
	//private List<String> namen;	// List
	private Set<String> namen;		//Set
	
	public void setNamen(/*String[]*/ /*List*/Set<String> namen) {
		this.namen = namen;
	}
	
	@Override
	public String toString() {
		//return Arrays.toString(namen);
		return namen.toString();
	}
	
}
