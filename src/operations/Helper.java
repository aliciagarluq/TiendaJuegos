package operations;

import model.Juegos;

public class Helper {

	public static double increaseRam(Juegos juego, int numRam) {

		juego.setRam(numRam);

		return numRam;

	}
//realizar iva
	public static double increaseIva(Juegos juego, double iva) {
		

		iva = (juego.getPrice() * 0.21);
		
		juego.setPrice(juego.getPrice()+iva);
		return iva;

	}

	//hacer descuentos
	public static double descount(Juegos juego, double descount1) {
		descount1= (juego.getPrice() * 0.25);
		
		juego.setPrice(juego.getPrice()-descount1);
		return descount1;
	}
//incremento de precio
	public static double increasePrice(Juegos juego, double increasePrice) {
		increasePrice= (juego.getPrice() * 0.25);
		
		juego.setPrice(juego.getPrice()+increasePrice);
		return increasePrice;
	}
	
}

// Fórmula velocidad: aceleracion por el tiempo, si pasa de velocidad maxima se
// limitará a esta misma
