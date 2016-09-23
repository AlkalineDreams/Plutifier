/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 * Returns your favourite planet from an enum.
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plutifier {
	
	public enum PLANETS {
		
		MERCURY("mercury"),
		VENUS("venus"),
		EARTH("earth"),
		MARS("mars"),
		JUPITER("jupiter"),
		SATURN("saturn"),
		URANUS("uranus"),
		NEPTUNE("neptune"),
		PLUTO("pluto");
		
		private final String planet;

	    PLANETS(String planet) {
	        this.planet = planet;
	    }
	    
	    public String getPlanet() {
	        return this.planet;
	    }
	    
		
	}

	public static void main(String[] args) throws IOException {
		
		String favouritePlanet;
		PLANETS favourite;
		
		System.out.println("What is your favourite planet?");
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		favouritePlanet = br.readLine();
		
		favourite = PLANETS.valueOf(favouritePlanet.toUpperCase());
		System.out.println("Your favourite planet is: " + favourite.planet + ".");
			
	}

}
