package daw1.comienzo;

import java.util.Scanner;

public class ejercicio31 {
	
	public static void main (String[] arg) {
		
		byte num1;
		byte num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un primer numero de dos cifras:");
		num1=sc.nextByte();
		
		System.out.println("Introduzca un segundo numero de dos cifras:");
		num2=sc.nextByte();
		
		byte suma = (byte) (num1+num2);
		
		System.out.println("El resultado de la suma: "+suma);
		
	}
}
