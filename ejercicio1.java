package t1.examen;

import java.util.Scanner;

public class ejercicio1 {
	
	public static boolean confirmacion() { /*Funcion booleana para que nos devuelva true o false*/
		Scanner sc = new Scanner(System.in);
		String respuesta;
		while(true) {
			System.out.println("¿Desea confirmar?");
			respuesta = sc.next();
			
			switch(respuesta) { 
			case "s":
				return true;
			case "S":
				return true;
			case "si":
				return true;
			case "SI":
				return true;
			case "j":
				return true;
			case "ja":
				return true;
			case "YA":
				return true;
			case "n":
				return false;
			case "N":
				return false;
			case "no":
				return false;
			case "NO":
				return false;
			case "nein":
				return false;
			case "Nein":
				return false;
			default:
				System.out.println("Error");
			}
		}
	}
	
	public static void main(String[] arg) {
		System.out.println(confirmacion()); /*Hacemos la llamada de la funcion para que imprima el resultado*/
	}
}
