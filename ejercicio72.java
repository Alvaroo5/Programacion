package daw1.comienzo;

import java.util.Scanner;

public class ejercicio72 {
	public static void main(String[] arg) {
		int edad;
		int nivel_estudios;
		int ingresos;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		System.out.println("Introduce tu nivel de estudio");
		nivel_estudios = sc.nextInt();
		System.out.println("Introduce tus ingresos");
		ingresos = sc.nextInt();
		
		boolean jasp =  (edad <= 28) && (nivel_estudios > 3) && (ingresos > 28000);
	}
}
