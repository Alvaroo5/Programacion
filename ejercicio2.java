package t1.examen;

import java.util.Scanner;

public class ejercicio2 {

	public static String mayusculas(char letra, String cadena) {
		String resultado="";
		
		for(int i = 0; i<cadena.length(); i++) {
			/*Si un caracter de la cadena es igual al que hemos introducido, en mayuscula sino en minuscula*/
			if(cadena.charAt(i)==letra) { 
				letra=Character.toUpperCase(letra);
			}
		}
		return resultado;
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		char letra;
		String cadena;
		
		System.out.println("Introduce un caracter:");
		letra=sc.next().charAt(0);
		
		System.out.println("Introduce una cadena de caracteres:");
		cadena=sc.next();
		
		
		System.out.println("La cadena resultante al poner la letra "+letra+" en mayúsculas es "+mayusculas(letra, cadena));
	}
}
