package gestionExcepcepcionesAleatorias;

public class ExcepcionSalida extends Exception{

	public String msj;
	
	public ExcepcionSalida(String msj) {
		super(msj);
		
	}
}
