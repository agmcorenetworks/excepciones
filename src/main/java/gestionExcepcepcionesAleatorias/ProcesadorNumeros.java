package gestionExcepcepcionesAleatorias;

import java.util.Random;
public class ProcesadorNumeros {
	int [] numeros;
	
	public ProcesadorNumeros() {
		numeros = new int[100];
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			numeros[i] = random.nextInt(101);
		}
	}
	
	public void procesaNumero(int numero) throws SuperiorException, InferiorException {
		if (numero == 0 || numero == 100 || numero == 50) {
			System.out.println("Programa terminado");
			System.exit(0);
		} if (numero > 80) {
			throw new SuperiorException();
		} else if (numero < 20) {
			throw new InferiorException();
		}
	}
}
