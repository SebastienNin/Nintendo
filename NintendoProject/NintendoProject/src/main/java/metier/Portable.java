package metier;

import java.time.LocalDate;

public class Portable extends Console{

	public Portable(String nom, Integer prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		
	}

	
	public String toString() {
		return "Portable [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

}
