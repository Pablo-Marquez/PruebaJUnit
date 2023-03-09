package practicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculadoraTest {

	private Calculadora calcu;
	
	@BeforeEach
	public void creaCalculadora() {
		calcu = new Calculadora(20,10);
	}
	@AfterEach
	public void borrarCalculadora() {
		calcu=null;
	}
	
	@Test
	public void testSuma() {
		double valorEsperado = 30;
	
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testMultiplica() {
		double valorEsperado = 200;
		double resultado = calcu.multiplica();
		assertEquals(valorEsperado, resultado, 0, "Fallo en la multiplicación: ");
	}

	@Test
	void testResta() {
		double valorEsperado = 10;
		double resultado = calcu.suma();
		assertEquals(valorEsperado, resultado, 0);
	}


	@Test
	public void testDivide() {
		double valorEsperado = 2;
		double resultado = calcu.divide();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void testExcepcion() {
		try {
			Calculadora calcu = new Calculadora(20, 0);
			double resultado = calcu.divide();
			fail("FALLO, Deberia haber lanzado la excepción");
		} catch (ArithmeticException e) {
			// PRUEBA satisfactoria
		}
	}
	
	
	@Test
	public void testDivide0() {
		Calculadora calcu = new Calculadora(20, 0);
		Assertions.assertThrows(ArithmeticException.class, () -> {calcu.divide0();});
		calcu.divide0();
	}
	
	@Test
	public void testDivide00() {
		Calculadora calcu = new Calculadora(20, 2);
		Exception exception = assertThrows(ArithmeticException.class, () -> calcu.divide0());
		calcu.divide0();
	}
	

}
