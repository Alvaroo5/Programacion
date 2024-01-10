package daw1.comienzo;

import java.util.Scanner;

public class ejercicio71 {
	public static void main(String[] arg) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a:");
		a = sc.nextInt();
		
		System.out.println("Introduce el valor de b:");
		b = sc.nextInt();
		
		a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}
}
