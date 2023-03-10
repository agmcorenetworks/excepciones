 /*Crear una clase que en el constructor genere un array de enteros de 100 valores aleatorios entre
	0 y 100 ambos incluidos.

	crear el metodo procesaNumero que recibe un numero y si el numero es mayor que 80 lance una SuperiorException y 
	si es menor que 20 una InferiorException. si el numero es 0, 100 o 50 el programa terminará directamente

	Crear un metodo main para comprobar el usando el metodo procesaNumero el array de enteros
	Crear un test junit para testear el metodo procesaNumero.*/

package gestionExcepcepcionesAleatorias;

import java.util.Random;

public class ExcepcionesAleatorias {

    public int [] valores_aleatorios;

    public ExcepcionesAleatorias() {
    	valores_aleatorios = new int[100];
    	Random numeroaleatorio = new Random();
    	
    	for (int i=0; i<100; i++) {
    		valores_aleatorios[i]= numeroaleatorio.nextInt(101);
    		System.out.println(valores_aleatorios[i]);
    	}
    }

    public void procesaNumero(int numero) throws SuperiorException, InferiorException {
        if (numero < 20) {
            throw new InferiorException("El número es menor que 20");
        }
        else if (numero > 80) {
            throw new SuperiorException("El número es mayor que 80");
        }
        else if (numero == 0 || numero == 50 || numero == 100) {
        	System.exit(0);
        }
    }

    public static void main(String[] args) {
    	ExcepcionesAleatorias Excepcion1  = new ExcepcionesAleatorias();
    	
    	for (int i = 0; i < Excepcion1.valores_aleatorios.length; i++) {
        	int numero = Excepcion1.valores_aleatorios[i];
            try {
                Excepcion1.procesaNumero(numero);
            } catch (SuperiorException e) {
                System.out.println("Con el numero: " + numero +" se ha producido una excepción: " + e.getMessage());
            } catch (InferiorException e) {
                System.out.println("Con el numero: " + numero + " se ha producido una excepción: " + e.getMessage());
            }
        }
        

    }
}
