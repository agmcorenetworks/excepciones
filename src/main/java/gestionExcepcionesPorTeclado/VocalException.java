package gestionExcepcionesPorTeclado;

public class VocalException extends Exception{
	public String msj;
	public VocalException(String msj) {
		super(msj);
	}
}
