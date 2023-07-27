package test;

import metier.Adresse;
import metier.Boutique;
import metier.Console;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c1 = new Console("DS");
		Console c2 = new Console("Wii");
		Console c3 = new Console("GameBoy Advance");
		Console c4 = new Console("Switch");
		Console c5 = new Console("Switch OLED");
		 
		Adresse a1 = new Adresse("10","Nintendo","Paris" );
		Boutique b1 = new Boutique("Nintendo",a1);
		
	}

}
