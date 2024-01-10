package daw1.comienzo;

import java.util.Scanner;

public class ejercicio54 {

	public static void main(String[] arg){

		int num1;
		int num2;

		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce un primer numero:");
		num1=sc.nextInt();

		System.out.println("Introduce un segundo numero:");
		num2=sc.nextInt();

		if (num1 % 2 == 0 && num2 % 2 == 0) {
		            System.out.println("Ambos números son pares.");
		        } else if (num1 % 2 == 0 || num2 % 2 == 0) {
		            System.out.println("Solo uno de los números es par.");
		        } else {
		            System.out.println("Ninguno de los números es par.");
		        }
		}

}
