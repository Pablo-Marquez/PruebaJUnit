package Ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	
	
	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	void testSuma() {
		double valorEsperado = 30;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	void testResta() {
		double valorEsperado = 10;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.resta();
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	void testMultiplicaciom() {
		double valorEsperado = 2000;
		Calculadora calcu = new Calculadora(20, 10);
		double resultado = calcu.multiplicacion();
		assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicación");
	}

	@Test
	void testDivision() {
		double valorEsperado = 2;
		Calculadora calcu = new Calculadora(20, 0);
		double resultado = calcu.division();
		assertEquals(valorEsperado, resultado, 0, "División entre 0");
	}

	@Test
	void testDivision0() {
		Calculadora calcu = new Calculadora(20, 0);
		Assertions.assertThrows(ArithmeticException.class, () -> {

			calcu.division0();

		});
	}

}
