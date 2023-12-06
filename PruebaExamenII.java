package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Resta;

class PruebaExamenII {

	@Test
	void testResta() {
		OperacionAritmetica resta = new OperacionAritmetica(new Resta());
		assertEquals(90, resta.procesar(120, 30));
		assertEquals(-2, resta.procesar(70, 125));
		assertEquals(-1, resta.procesar(-40, 100));
	}

	@Test
	void testDivision() {
		OperacionAritmetica division = new OperacionAritmetica(new Division());
		assertEquals(4, division.procesar(100, 25));
		assertEquals(-3, division.procesar(23, 0));
		assertEquals(-1, division.procesar(-44, 2));
	}
}