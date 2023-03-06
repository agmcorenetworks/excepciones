package gestionExcepcionesPorTeclado;

public class SalidaException extends Exception{
	public String msj;
	public SalidaException(String msj) {
		super(msj);
	}
}