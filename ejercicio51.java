package daw1.comienzo;

import java.util.Scanner;

public class ejercicio51 {

	public static void main(String[] arg){

		int num;

		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce un numero:");
		num=sc.nextInt();

		if(num>=0){
		System.out.println("El numero introducido es positivo");
		}else{
		System.out.println("El numero introducido es negativo");
		}
		}

}
