package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Juegos;
import operations.Helper;

class HelperTest {

	@Test
	void testIncreaseRam() {
		Juegos juego1 = new Juegos("Animal Crossing", 4, 20.5, "XBOX");
		Juegos juego2 = new Juegos("Spyro", 5, 21.2, "PC");
		Juegos juego3 = new Juegos("Mario Cars", 3, 15.1, "PLAY 4");
		Helper increase = new Helper();
		Helper.increaseRam(juego1, 5);
		Helper.increaseRam(juego2, 6);
		Helper.increaseRam(juego3, 4);
		assertEquals(Helper.increaseRam(juego1, 8),juego1.getRam());
		assertEquals(Helper.increaseRam(juego2, 7),juego2.getRam());
		assertEquals(Helper.increaseRam(juego3, 6),juego3.getRam());

		}
	

	@Test
	void testIva() {
		Juegos juego1 = new Juegos("Animal Crossing", 4, 20.5, "XBOX");
		Juegos juego2 = new Juegos("Spyro", 5, 21.2, "PC");
		Juegos juego3 = new Juegos("Mario Cars", 3, 15.1, "PLAY 4");
		Helper increase = new Helper();
		
		assertEquals(24.805-juego1.getPrice(),  Helper.increaseIva(juego1, juego1.getPrice()));

	}
	@Test
	void testIncreasePrice() {
		Juegos juego1 = new Juegos("Animal Crossing", 4, 20.5, "XBOX");
		Juegos juego2 = new Juegos("Spyro", 5, 21.2, "PC");
		Juegos juego3 = new Juegos("Mario Cars", 3, 15.1, "PLAY 4");
		assertEquals(3.775,  Helper.increasePrice(juego3, juego3.getPrice()));
	
	}
	@Test
	void testDescountPrice() {
		Juegos juego1 = new Juegos("Animal Crossing", 4, 20.5, "XBOX");
		Juegos juego2 = new Juegos("Spyro", 5, 21.2, "PC");
		Juegos juego3 = new Juegos("Mario Cars", 3, 15.1, "PLAY 4");
		Helper increase = new Helper();
		assertEquals(5.3,  Helper.descount(juego2, juego2.getPrice()));
	}

}
