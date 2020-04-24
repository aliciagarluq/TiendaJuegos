package operations;

import model.Juegos;

public class Helper {

	public static double increaseRam(Juegos juego, int numRam) {

		juego.setRam(numRam);

		return numRam;

	}

	public static double increaseIva(Juegos juego, double iva) {
		

		iva = (juego.getPrice() * 0.21);
		
		juego.setPrice(juego.getPrice()+iva);
		return iva;

	}




	
}

// Fórmula velocidad: aceleracion por el tiempo, si pasa de velocidad maxima se
// limitará a esta misma
