package daw1.comienzo;

import java.util.Scanner;

public class ejercicio81 {

	public static void main(String[] arg) {
		int numIntroducido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		numIntroducido = sc.nextInt();
		
		while(numIntroducido != 0) {
			String result = (numIntroducido%2 == 0) ? "Es par" : "Es impar";
			System.out.println(result);
			String a = (numIntroducido < 0) ? "Negativo" : "Positivo";
			System.out.println(a);
			int cuadrado = numIntroducido*numIntroducido;
			System.out.println(cuadrado);
			System.out.println("Introduce un numero:");
			numIntroducido = sc.nextInt();
		}
	}
}
