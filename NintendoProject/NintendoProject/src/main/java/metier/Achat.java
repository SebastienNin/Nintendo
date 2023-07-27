package metier;

import java.time.LocalDate;

public class Achat {

	private Jeu jeu;
	private LocalDate date;
	private int prix;

	public Achat(Jeu jeu, LocalDate date, int prix) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}

	public Jeu getJeu() {
		return jeu;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getPrix() {
		return prix;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + "]";
	}

}
