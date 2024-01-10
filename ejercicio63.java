package daw1.comienzo;

import java.util.Scanner;

public class ejercicio63 {
	
	public static void main(String[] arg) {
		int num;
		int par;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero:");
		num = sc.nextInt();
		
		if(num%2 == 0) {
			par = 1;
			System.out.println("El valor de par es: "+par);
		}else {
			par = 0;
			System.out.println("El valor de par es: "+par);
		}
	}
	
}
