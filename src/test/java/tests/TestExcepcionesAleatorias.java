package tests;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import gestionExcepcepcionesAleatorias.ExcepcionesAleatorias;
import gestionExcepcepcionesAleatorias.InferiorException;
import gestionExcepcepcionesAleatorias.SuperiorException;

public class TestExcepcionesAleatorias {
	
	
	@Test
	public void testException() {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		
	
		try {
			e1.saltaExcepcion(81);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertTrue(true, e.getMessage());
		}
	}
	
	
	@Test
	public void testException2() {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		
	
		try {
			e1.saltaExcepcion(97);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertTrue(true, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		}
	}
	
	@Test
	public void testException3() {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		

		try {
			e1.saltaExcepcion(23);
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			assertFalse(false, e.getMessage());
		}
	
		
	}
	
}
