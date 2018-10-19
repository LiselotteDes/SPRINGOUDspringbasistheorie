package be.vdab;

class ClassB implements InterfaceB {
	
	// *** Constructor Injection ***
	private final String telefoonNrHelpDesk;
	private final int aantalPogingenUpdateKlant;
	
	ClassB(String telefoonNrHelpDesk, int aantalPogingenUpdateKlant) {
		this.telefoonNrHelpDesk = telefoonNrHelpDesk;
		this.aantalPogingenUpdateKlant = aantalPogingenUpdateKlant;
	}

	@Override
	public String getBoodschap() {
		return "ClassB object";
	}
	
	public String getTelefoonNrHelpDesk() {
		return telefoonNrHelpDesk;
	}
	
	public int getAantalPogingenUpdateKlant() {
		return aantalPogingenUpdateKlant;
	}
}
