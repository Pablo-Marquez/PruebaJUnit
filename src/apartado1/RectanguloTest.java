package apartado1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ejemplos.Calculadora;

class RectanguloTest {

private Rectangulo rectangulo1;	
	
	@Test
	void testRectangulo() {
		fail("Not yet implemented");
	}

	@Test
	void testArea() {
		double valorEsperado = 25;
		double resultado = rectangulo1.area();
		assertEquals(valorEsperado, resultado, 0,"ERROR");
	}

}
