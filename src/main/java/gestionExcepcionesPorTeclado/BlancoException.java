package gestionExcepcionesPorTeclado;

public class BlancoException extends Exception{
	public String msj;
	public BlancoException(String msj) {
		super(msj);
	}
}