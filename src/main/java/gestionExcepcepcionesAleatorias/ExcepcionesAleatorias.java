package gestionExcepcepcionesAleatorias;
import java.util.Random;

public class ExcepcionesAleatorias {
	 Random random = new Random();
	private int[] miArray;
	
	public ExcepcionesAleatorias(){
		
		 miArray = new int[100];

		    for (int i = 0; i < miArray.length; i++) {
		    	
		      miArray[i] = random.nextInt(101); // genera un número aleatorio entre 0 y 100 (ambos incluidos)
		    }

		  }
	
	public void saltaExcepcion(int num) throws SuperiorException, InferiorException {
		if (num>80) {
	    	  throw new SuperiorException("Ha superado 80");
	      }else if(num<20) {
	    	  throw new InferiorException("No ha superado a 20");
	      }
	}
	
	public void procesaNumero() {
		for (int i = 1; i < miArray.length+1; i++) {
			
		      if(miArray[i] == 0 || miArray[i] == 50 || miArray[i] == 100) {
		    	  break;
		      }else {
		    	  try {
					saltaExcepcion(miArray[i]);
				} catch (SuperiorException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				} catch (InferiorException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
		      }
		    }
	}
	

	
	public static void main(String [] args) {
		ExcepcionesAleatorias e1 = new ExcepcionesAleatorias();
		
		
				e1.procesaNumero();
			
		}
		}
		
		
	
	
	


