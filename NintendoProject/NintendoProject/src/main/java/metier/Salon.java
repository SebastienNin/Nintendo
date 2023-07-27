package metier;

import java.time.LocalDate;

public class Salon extends Console{

	public Salon(String nom, Integer prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		
	}

	
	public String toString() {
		return "Salon [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

}
