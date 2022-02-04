package com.example.juegos.numero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.example.juegos.Juego;
import com.example.juegos.JuegoException;

class JuegoDelNumeroTest {

	Juego juego;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		juego = new JuegoDelNumero();
		((JuegoDelNumero)juego).numeroBuscado=50;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testJuegoDelNumero() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testInicializar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testJugadaString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testJugadaInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetResultado() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetFinalizado() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetJugada() {
//		fail("Not yet implemented");
//	}

	@Nested
	class jugadas {
		@Test
		void test_es_mayor() throws JuegoException {
			juego.jugada("51");
			assertAll("Jugada", () -> assertEquals("Mi número es menor.", juego.getResultado()),
					() -> assertEquals(1, juego.getJugada()));

		}

		@Test
		void test_es_menor() throws JuegoException {
			juego.jugada("49");
			assertAll("Jugada", () -> assertEquals("Mi número es mayor.", juego.getResultado()),
					() -> assertEquals(1, juego.getJugada()));

		}

		@Test
		void test_es_igual() throws JuegoException {
			juego.jugada("50");
			assertAll("Jugada", () -> assertEquals("Bien!!! Acertaste.", juego.getResultado()),
					() -> assertEquals(1, juego.getJugada()));
		}
		
		@Test
		void es_Finalizado() throws JuegoException{
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			juego.jugada("8");
			assertAll("Jugada", 
					() -> assertEquals(true, juego.getFinalizado()),
					() -> assertEquals("Upsss! Se acabaron los intentos, el número era el 50", juego.getResultado()),
					() -> assertEquals(10, juego.getJugada())
					);
		}

	}
}
