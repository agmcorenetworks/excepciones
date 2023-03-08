package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gestionExcepcepcionesAleatorias.ExcepcionesAleatorias;
import gestionExcepcepcionesAleatorias.InferiorException;
import gestionExcepcepcionesAleatorias.SuperiorException;

public class TestExcepcionAleatoria {

//	@Test
//	public void testExceptionSuperior() {
//		ExcepcionesAleatorias prueba80 = new ExcepcionesAleatorias();
//
//		// COMPRUEBO SI LA EXCEPCION SALTA CORRECTAMENTE AL INTRODUCIR UN NUMERO MAYOR
//		// QUE 80
//		try {
//			prueba80.procesaNumero(19);
//		} catch (SuperiorException e) {
//			assertTrue(e.getMessage().contains("SuperiorException")); // DA VERDE PORQUE HA SALTADO LA EXCEPCIONSUPERIOR
//		} catch (InferiorException e) {
//			assertFalse(e.getMessage().contains("SuperiorException")); // Comprueba correctamente que no es esa
//																		// excepcion la que esta saltando
//		}
//	}

	@Test
	public void testMenor20() {
		ExcepcionesAleatorias prueba20 = new ExcepcionesAleatorias();
		
		//COMPRUEBO QUE LA EXCEPCION INFERIOR SALTA CORRECTAMENTE
		try {
			prueba20.procesaNumero(0);
			assertTrue(false); // DARA ROJO SI NO CUMPLE CON LA EXCEPCIONINFERIOR 
		} catch (SuperiorException e) {
			assertTrue(false);
		} catch (InferiorException e) {
			assertTrue(e.getMessage().contains("InferiorException")); //SOLO SALTARÁ TRUE SI EL NUMERO ES INFERIOR - VERDE
		}
	}

}
