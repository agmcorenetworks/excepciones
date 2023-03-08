package gestionExcepcepcionesAleatorias;

import java.util.Random;

public class ExcepcionesAleatorias {
	
	//ATRIBUTO
	private int[] mi_array;
	
	//CONSTRUCTOR
	public ExcepcionesAleatorias() {
		this.mi_array = new int[100];
		Random num_aleatorio = new Random();

		for (int i = 0; i < mi_array.length; i++) {
			mi_array[i] = num_aleatorio.nextInt(101);
			//System.out.println(mi_array[i]); 	IMPRIMO EL ARRAY						
		}
	}
	
	public int[] getArray() {
		
		return mi_array;
		
	}
	
	public void procesaNumero(int numero) throws SuperiorException, InferiorException {
		
		if (numero > 80) {
			throw new SuperiorException("SuperiorException");
		}
		else if (numero < 20) {
			throw new InferiorException("InferiorException");
		}
	}

	
	public static void main(String[] args) {

		ExcepcionesAleatorias array1 = new ExcepcionesAleatorias();
			
		//GUARDO EL ARRAY EN MYARRAYS
		   int[] myArray = array1.getArray();
		   
		   //ITERANDO EL ARRAY Y LLAMANDO AL METODO procesaNumero()
		   for (int i = 0; i < myArray.length; i++) {
			   try {
				array1.procesaNumero(myArray[i]); 
			} catch (SuperiorException e) {
		
				System.out.println(e.getMessage());
			} catch (InferiorException e) {
				
				System.out.println(e.getMessage());
			}
			   if (myArray[i] == 0 || myArray[i] == 50 || myArray[i] == 100) {
					System.out.println("Programa finalizado");
					break;
				} 
		   }
	}
}
