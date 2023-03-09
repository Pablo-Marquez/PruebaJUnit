package apartado2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesFechaTest {

	@Test
	void testComprobarBisiesto1() {
		
		boolean esperado=true;
		boolean resultado=UtilidadesFecha.comprobarBisiesto(88);
		assertEquals(esperado,resultado);
	}

	@Test
	void testComprobarBisiesto2() {
		
		boolean esperado=false;
		boolean resultado=UtilidadesFecha.comprobarBisiesto(88);
		assertEquals(esperado,resultado);
	}
}
