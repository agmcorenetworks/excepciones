package gestionExcepcepcionesAleatorias;

public class SuperiorException extends Exception {
	public SuperiorException() {
		super("El numero es mayor que 80");
	}
}