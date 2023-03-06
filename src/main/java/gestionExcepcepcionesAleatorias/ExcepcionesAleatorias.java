package gestionExcepcepcionesAleatorias;
import java.util.Random;

public class ExcepcionesAleatorias {
	
	private int[] array= {};
	
	public ExcepcionesAleatorias(){
		

		
		    array = new int[100];
		    Random random = new Random();

		    for (int i = 0; i < array.length; i++) {
		      array[i] = random.nextInt(101); // genera un número aleatorio entre 0 y 100 (ambos incluidos)
		    }

		    
		  }
	
	public void procesaNumero() {
		for (int i = 0; i < array.length; i++) {
		      if (i>80) {
		    	  Superiorexcepcion
		      }else if(i<20) {
		    	  Inferiorexcepcion
		      }
		      
		      
		    }
		
	}
	
	public static void main(String [] args) {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		
		e1.procesaNumero();
		
		
		
	}
	
	
}


