package daw1.comienzo;

import java.util.Scanner;

public class ejercicio88 {
	
	public static void main(String [] arg) {
		
		int i;
		int num;
		int factorial=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero para factorizar:");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			factorial = factorial*i;
			
			
			
		}
		System.out.println(factorial);
	}
}
