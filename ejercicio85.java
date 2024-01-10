package daw1.comienzo;

import java.util.Scanner;

public class ejercicio85 {

	public static void main(String[] arg) {
		int minValue;
		int maxValue;
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor minimo del rango:");
		minValue = sc.nextInt();
		
		System.out.println("Introduce el valor maximo del rango:");
		maxValue = sc.nextInt();
		
		System.out.println("Introduce el valor dentro del rango:");
		valor = sc.nextInt();
		
		if(valor<maxValue && valor>minValue) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
	}
}
