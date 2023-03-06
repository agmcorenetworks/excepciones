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
	
	public void procesaNumero() throws SuperiorException, InferiorException{
		for (int i = 0; i < array.length; i++) {
		      if (i>80) {
		    	  throw new SuperiorException("Ha superado 80");
		      }else if(i<20) {
		    	  throw new InferiorException("No ha superado a 20");
		      }
		      
		      
		    }
		
	}
	
	public static void main(String [] args) {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		
		try {
			e1.procesaNumero();
		} catch (SuperiorException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (InferiorException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
}


