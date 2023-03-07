package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
			test.procesaNumero(4);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertTrue(true,e.getMessage());
		}
	}
	
	@Test
	void TestExcepcionSuperior() {
		ExcepcionesAleatorias test = new ExcepcionesAleatorias();
		try {
			test.procesaNumero(89);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertTrue(true,e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		}
	}
	
	@Test
	void TestSinExcepcion() {
		ExcepcionesAleatorias test = new ExcepcionesAleatorias();
		try {
			test.procesaNumero(46);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		}
	}
}
