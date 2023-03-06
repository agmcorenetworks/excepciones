package gestionExcepcionesPorTeclado;

import java.util.Scanner;

public class LeerPorTeclado {
	private Scanner leerTeclado;

	public LeerPorTeclado() {
		leerTeclado = new Scanner(System.in);
	}
	
	public char getChar() {
		System.out.println("Por favor, introduzca un caracter ('x' para salir): ");
		String caracter =  leerTeclado.nextLine().toLowerCase();
		char c = 'f';
		if (caracter.length() > 0) {
			c = caracter.charAt(0);
		}		
		return c;		
	}
	
	public void processChar(char caracter) throws VocalException, NumeroException, BlancoException, SalidaException {
		switch (caracter){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			throw new VocalException("Excepción de vocal");
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			throw new NumeroException("Excepción de número");
		case ' ':
			throw new BlancoException("Excepción de espacio en blanco");
		case 'x':
			throw new SalidaException("Excepción de salida");
		default:
			System.out.println("El caracter no lanza excepciones");
		}
	}
	
	public static void main (String [] args) {
		LeerPorTeclado teclado = new LeerPorTeclado();
		boolean caracterX = true; 
		while (caracterX) {
			char caracter = teclado.getChar();
			try {
				teclado.processChar(caracter);
			} catch (VocalException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (NumeroException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (BlancoException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (SalidaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				caracterX = false;
			}
		}
	}
}
