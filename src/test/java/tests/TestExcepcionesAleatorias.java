package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import gestionExcepcepcionesAleatorias.ExcepcionesAleatorias;
import gestionExcepcepcionesAleatorias.InferiorException;
import gestionExcepcepcionesAleatorias.SuperiorException;

public class TestExcepcionesAleatorias {

	@Test
	void TestExcepcionInferior() {
		ExcepcionesAleatorias test = new ExcepcionesAleatorias();
		try {
			test.procesaNumero(10);
			assertTrue(false);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertTrue(false, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertTrue(true,e.getMessage());
		}
	}
	
	@Test
	void TestExcepcionSuperior() {
		ExcepcionesAleatorias test = new ExcepcionesAleatorias();
		try {
			test.procesaNumero(81);
			assertTrue(false);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertTrue(true,e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertTrue(false, e.getMessage());
		}
	}
	
	@Test
	void TestSinExcepcion() {
		ExcepcionesAleatorias test = new ExcepcionesAleatorias();
		try {
			test.procesaNumero(26);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertTrue(false, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertTrue(false, e.getMessage());
		}
	}
}