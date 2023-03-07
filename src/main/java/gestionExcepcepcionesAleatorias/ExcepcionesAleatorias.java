package gestionExcepcepcionesAleatorias;
import java.util.Random;
public class ExcepcionesAleatorias {
	static int[] num;
	public ExcepcionesAleatorias() {
		num = new int [100];
		for (int i = 0; i<100;i++) {
			num[i] = (int) (Math.random()*101+0);
		}
	}
	void getNumeros() {
		for (int i = 0; i<100;i++) {
			System.out.println(num[i]);
				}
	}
    public void procesaNumero(int numero) throws SuperiorException, InferiorException {
        
    	if (numero == 0 || numero == 100 || numero == 50) {
            System.exit(0);;
        } else if (numero > 80) {
            throw new SuperiorException("El número es mayor que 80");
        } else if (numero < 20) {
            throw new InferiorException("El número es menor que 20");
        }
    }
	
	public static void main(String [] args) {
		ExcepcionesAleatorias prueba = new ExcepcionesAleatorias();
			prueba.getNumeros();
			procesaNumero();
		}
}


