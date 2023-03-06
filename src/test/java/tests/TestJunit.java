package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import gestionExcepcionesPorTeclado.BlancoException;
import gestionExcepcionesPorTeclado.LeerPorTeclado;
import gestionExcepcionesPorTeclado.NumeroException;
import gestionExcepcionesPorTeclado.SalidaException;
import gestionExcepcionesPorTeclado.VocalException;

public class TestJunit {	
	
	@Test
	void testException() {
		LeerPorTeclado teclado = new LeerPorTeclado();
		try {
			teclado.processChar('1');
			assertTrue(false);
		} catch (VocalException e) {
			// TODO Auto-generated catch block
			assertTrue(e.getMessage().contains("Excepción de vocal"));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false,"Esta excepcion no es la correcta");
		} catch (BlancoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		} catch (SalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}

}
