package t1.examen;

import java.util.Scanner;

public class ejercicio4 {

	public static int recursiva(int num1, int num2) {
		
		for(int i = 0; i<num2; i++) /*Creamos un bucle desde 0 hasta el segundo numero*/
			num1++; /*El primer numero se va sumando*/
		return num1+(recursiva(num1, num2));
		
	}
	
	public static void main(String[] arg) { 
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Introduce un primer numero: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce un segundo numero: ");
		num2=sc.nextInt();
		
		System.out.println("El resultado de la multiplicacion entre los numeros "+num1+" y "+num2+" es: "+recursiva(num1, num2));
	}
}
