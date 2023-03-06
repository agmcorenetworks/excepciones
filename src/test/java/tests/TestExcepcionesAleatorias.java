package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import gestionExcepcepcionesAleatorias.ExcepcionesAleatorias;
import gestionExcepcepcionesAleatorias.InferiorException;
import gestionExcepcepcionesAleatorias.SuperiorException;


public class TestExcepcionesAleatorias {
	
	
	@Test
	void testException() {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		
	
			try {
				e1.procesaNumero();
				assertTrue(false);
			} catch (SuperiorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assertTrue(false,"Esta excepcion ha superado 80");
			} catch (InferiorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assertTrue(false,"Esta excepcion no ha superado 20");
			}
			
		
		}
	
}
