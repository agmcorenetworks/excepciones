package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import gestionExcepcepcionesAleatorias.ExcepcionesAleatorias;
import gestionExcepcepcionesAleatorias.InferiorException;
import gestionExcepcepcionesAleatorias.SuperiorException;

public class ExcepcionesAleatoriasTest {
    @Test
    public void testProcesaNumeroSuperior() throws SuperiorException, InferiorException {
        ExcepcionesAleatorias prueba = new ExcepcionesAleatorias();
        prueba.ProcesadorNumeros(85);
    }

    @Test
    public void testProcesaNumeroInferior() throws SuperiorException, InferiorException {
    	ExcepcionesAleatorias prueba = new ExcepcionesAleatorias();
        prueba.ProcesadorNumeros(15);
    }

    @Test
    public void testProcesaNumeroValido() throws SuperiorException, InferiorException {
    	ExcepcionesAleatorias prueba = new ExcepcionesAleatorias();
        prueba.ProcesadorNumeros(50);
        assertTrue(true);
    }
}
