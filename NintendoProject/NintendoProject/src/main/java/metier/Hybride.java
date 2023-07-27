package metier;

import java.time.LocalDate;

public class Hybride extends Console{

	public Hybride(String nom, Integer prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		
	}

	
	public String toString() {
		return "Hybride [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

}
