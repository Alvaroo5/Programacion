package daw1.comienzo;

import java.util.Scanner;

public class ejercicio33 {

	public static void main(String[] arg){
		Double num1;
		Double num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un primer numero:");
		num1=sc.nextDouble();

		System.out.println("Introduzca un segundo numero:");
		num2=sc.nextDouble();

		Float division=(float)(num1/num2);

		System.out.println("El resultado es: "+division);

		}

}
