package be.vdab.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

// *** Converter classes ***

/*
 * Je implementeert de interface Converter.
 * Je vervangt S door het type vanwaar je converteert: String.
 * Je vervangt T door het type naar waar je converteert: Date.
 */
public class StringToDateConverter implements Converter<String, Date> {

	/*
	 * Je definieert met dit patroon hoe je de onderdelen van een String (die je naar een Date wil omzetten) interpreteert.
	 * yyyy betekent jaar, MM maand, dd dag.
	 */
	private static final String DATUM_FORMAAT = "yyyy-MM-dd";
	
	/*
	 * Dit is de method convert uit de interface Converter.
	 * Je krijgt een String parameter binnen met de te converteren waarde.
	 * Je geeft als returnwaarde een Date terug.
	 */
	@Override
	public Date convert(String string) {
		
		/*
		 * De class SimpleDateFormat kan een String omzetten naar een Date.
		 * Je geeft aan de constructor het patroon mee dat je in het veld gemaakt hebt.
		 */
		SimpleDateFormat format = new SimpleDateFormat(DATUM_FORMAAT);
		try {
			// De parse method geeft een Date object terug, gebaseerd op de String parameter.
			return format.parse(string);
		} 
		/*
		 * De parse method werpt een ParseException als de conversie mislukt.
		 * Spring verwacht echter dat je bij mislukte conversies een IllegalArgumentException werpt.
		 */
		catch (ParseException ex) {
			throw new IllegalArgumentException(ex);
		}
	}
}
