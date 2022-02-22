package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosicionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	

	@Test
	void testPosicionIntInt() {
		Posicion p1 = new Posicion(1, 2);
		assertNotEquals(p1.getLaFila(), p1.getLaColumna());
	}

	@Test
	void testPosicionCharChar() {
		Posicion p1 = new Posicion('a', 'h');
		assertNotEquals(p1.getLaFila(), p1.getLaColumna(), "posicion valida");
	}
	
	@Test	
	void comprobarPosicionNoEsIgual() {
		Posicion p1 = new Posicion(1, 9);
		assertEquals(p1.getLaFila(), p1.getLaColumna());
	}

}
