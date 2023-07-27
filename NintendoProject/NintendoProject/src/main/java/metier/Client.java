package metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Achat> achats = new ArrayList<>();;
	
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/*public void ajouterAchat(Jeu jeu, LocalDate date, int prix) {
		Achat nouvelAchat = new Achat(jeu, date, prix);
		achats.add(nouvelAchat);
	}*/

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Achat> getAchats() {
		return achats;
	}

	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", achats=" + achats + "]";
	}	
	
	
}
