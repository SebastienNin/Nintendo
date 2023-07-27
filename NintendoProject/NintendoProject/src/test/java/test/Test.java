package test;

import java.time.LocalDate;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portable c1 = new Portable("DS", 150, LocalDate.now());
		Salon c2 = new Salon("Wii", 100, LocalDate.now());
		Portable c3 = new Portable("GameBoy Advance", 80, LocalDate.now());
		Hybride c4 = new Hybride("Switch", 350, LocalDate.now());
		Hybride c5 = new Hybride("Switch OLED", 380, LocalDate.now());			
		
		Client cl1 = new Client("Titi", "TOTO");
		Client cl2 = new Client("Doe", "John");
		 
		Adresse a1 = new Adresse("10","Nintendo","Paris" );
		Boutique b1 = new Boutique("Nintendo",a1);
		
		Jeu j1 = new Jeu("Jeu 1", c1, b1);
		Jeu j2 = new Jeu("Jeu 2", c1, b1);
		Jeu j3 = new Jeu("Jeu 3", c1, b1);
		Achat achat1 = new Achat(j1, LocalDate.now(), 10);
		Achat achat2 = new Achat(j2, LocalDate.now(), 10);
		cl1.getAchats().add(achat1);
		cl1.getAchats().add(achat2);
		
	}

}
