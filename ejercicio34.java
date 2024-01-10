package daw1.comienzo;

import java.util.Scanner;

public class ejercicio34 {

	public static void main(String[] arg){
		float num1;
		float millas = 1609;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una medida en millas:");
		num1=sc.nextFloat();

		Float km = (float) (num1*millas);

		System.out.println(num1+(" metros son ")+km);
		}

}
