package gestionExcepcionesPorTeclado;

public class NumeroException extends Exception{
	public String msj;
	public NumeroException(String msj) {
		super(msj);
	}
}