package daw1.comienzo;

import java.util.Scanner;

public class ejercicio84 {

	public static void main(String[] arg) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero positivo:");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
            System.out.println(i);
		}
	}
}
