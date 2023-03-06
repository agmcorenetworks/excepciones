package gestionExcepcepcionesAleatorias;

public class InferiorException extends Exception {
	public String msj;
	public InferiorException(String msj) {
		super(msj);
	}
}
