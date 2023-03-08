package tests;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gestionExcepcionesPorTeclado.BlancoException;
import gestionExcepcionesPorTeclado.LeerPorTeclado;
import gestionExcepcionesPorTeclado.NumeroException;
import gestionExcepcionesPorTeclado.SalidaException;
import gestionExcepcionesPorTeclado.VocalException;
public class TestJunit {	
	
	@Test
	public void testException() {	
		
		LeerPorTeclado teclado = new LeerPorTeclado();
		try {
			teclado.processChar('e');
			assertTrue(false);
		} catch (VocalException e) {
			// TODO Auto-generated catch block
			assertTrue(e.getMessage().contains("Excepción de vocal"));
		} catch (NumeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
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
