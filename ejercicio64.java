package daw1.comienzo;

import java.util.Scanner;

public class ejercicio64 {
	public static void main(String[] arg) {
		byte num1;
		byte num2;
		byte menor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero:");
		num1=sc.nextByte();
		
		System.out.println("Introduce un segundo numero:");
		num2=sc.nextByte();
		
		if(num1>num2) {
			menor = num2;
			System.out.println("El numero menor es: "+menor);
		}else {
			menor = num1;
			System.out.println("El numero menor es: "+menor);
		}
	}
}
