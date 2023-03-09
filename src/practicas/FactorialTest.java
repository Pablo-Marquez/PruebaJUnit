package practicas;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FactorialTest {

	@Test
	void testCalculo() {
		double esperado = 6;
		double factorial = Factorial.calculo(3);
		assertEquals(esperado, factorial, 0,"ERROR");

	}
	@ParameterizedTest
	@CsvSource({"5, 120", "7, 5040"})
	void testCalculoParametrizado(int numero, int esperado) {
		
		int resultado=Factorial.calculo(numero);
		assertEquals(esperado,resultado,"error");
	}
	@ParameterizedTest
	@ValueSource(strings= {"Hola","Mundo"})
	void testMensaje(String mensaje) {
		
		assertDoesNotThrow(()->Factorial.mensajeNulo(mensaje));
		
	}
	@ParameterizedTest
	@ValueSource(strings= {"Falso","False"})
	void comparaTest(String cadena) {
		assertEquals(false, Factorial.compara(cadena));
	}

}
