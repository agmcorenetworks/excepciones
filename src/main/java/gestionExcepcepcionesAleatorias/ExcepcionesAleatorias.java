package gestionExcepcepcionesAleatorias;
/**Crear una clase que en el constructor genere un array de enteros de 100 valores aleatorios entre
0 y 100 ambos incluidos.

crear el metodo procesaNumero que recibe un numero y si el numero es mayor que 80 lance una SuperiorException y 
si es menor que 20 una InferiorException. si el numero es 0, 100 o 50 el programa terminará directamente

Crear un metodo main para comprobar el usando el metodo procesaNumero el array de enteros
Crear un test junit para testear el metodo procesaNumero. */

public class ExcepcionesAleatorias {
	public static void main(String[]args) {
        ProcesadorNumeros procesador = new ProcesadorNumeros();
        for (int numero : procesador.numeros) {
            try {
                procesador.procesaNumero(numero);
            } catch (SuperiorException e) {
                System.out.println(numero + " -" + e.getMessage());
            } catch (InferiorException e) {
                System.out.println(numero + " -" + e.getMessage());
            }
        }
    }

	public void ProcesadorNumeros(int i) {
		// TODO Auto-generated method stub
		
	}
}

