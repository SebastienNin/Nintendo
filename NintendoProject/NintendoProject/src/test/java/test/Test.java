package test;

import metier.Client;

import java.time.LocalDate;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c1 = new Console("DS");
		Console c2 = new Console("Wii");
		Console c3 = new Console("GameBoy Advance");
		Console c4 = new Console("Switch");
		Console c5 = new Console("Switch OLED");		
		
		Client cl1 = new Client("Titi", "TOTO");
		Client cl2 = new Client("Doe", "John");
		 
		Adresse a1 = new Adresse("10","Nintendo","Paris" );
		Boutique b1 = new Boutique("Nintendo",a1);
		
		Jeu j1 = new Jeu("Jeu 1", c1, b1);
		Jeu j2 = new Jeu("Jeu 2", c1, b1);
		Achat achat1 = new Achat(j1, LocalDate.now(), 10);
		cl1.getAchats().add(achat1);
		
	}

}
