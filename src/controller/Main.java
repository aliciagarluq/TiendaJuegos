package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Juegos;
import operations.Helper;

public class Main {

	public static void main(String[] args) {
		ArrayList<Juegos> array = new ArrayList<Juegos>();
		Juegos juego1 = new Juegos("Animal Crossing", 4, 20.5, "XBOX");
		Juegos juego2 = new Juegos("Spyro", 5, 21.2, "PC");
		Juegos juego3 = new Juegos("Mario Cars", 3, 15.1, "PLAY 4");
		/*Scanner teclado=new Scanner (System.in);
		System.out.println("dame el precio del juego Animal Crossing");
		
		juego1.setPrice(teclado.nextDouble());*/
		//juego1.setPrice(18.3);
		Helper increase = new Helper();
		increase.increaseRam(juego1, 5);
		increase.increaseRam(juego2, 8);
		increase.increaseRam(juego3, 2);
		increase.increaseIva(juego1,8);
		

		array.add(juego1);
		array.add(juego2);
		array.add(juego3);

		for (Juegos juego : array) {
			System.out.println(juego.toString());
		}

	}

}
