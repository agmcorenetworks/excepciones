package gestionExcepcepcionesAleatorias;

public class ExcepcionesAleatorias {
	private int numeros[];
	
	public ExcepcionesAleatorias() {
		numeros = new int[100];
		for (int i = 0 ;i <100; i++) {
			numeros[i] = (int)(Math.random()*101+0);
		}
	}
	
	public void procesaNumero(int numero) throws SuperiorException, InferiorException {
		if (numero > 80) {
			throw new SuperiorException("Excepción por número mayor que 80");
		}
		else if (numero < 20) {
			throw new InferiorException("Excepción por número menor que 20");
		}
	}
	
	public void muestraNumeros() {
		for(int i:numeros) {
			System.out.println(numeros[i]);
		}
	}
	
	public int[] getNumeros() {
		return numeros;
	}
	
	public static void main (String[]args) {
		ExcepcionesAleatorias prueba = new ExcepcionesAleatorias();
		int[] lista = prueba.getNumeros();
		for (int i:lista) {
			try {
				prueba.procesaNumero(i);
			} catch (SuperiorException e) {
				// TODO Auto-generated catch block
				System.out.println("Numero: " + i + ". " +  e.getMessage());
			} catch (InferiorException e) {
				// TODO Auto-generated catch block
				System.out.println("Numero: " + i + ". " +  e.getMessage());
			}
			if (i == 0 || i == 50 || i == 100) {
				System.out.println(i + ". Cerrando el programa");
				break;
			}
		}
		
	}
}
