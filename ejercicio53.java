package daw1.comienzo;

import java.util.Scanner;

public class ejercicio53 {

	public static void main(String[] arg){

		int num;

		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce un numero:");
		num=sc.nextInt();

		if(num%2 == 0){
		System.out.println("El numero introducido no es impar");
		}else{
		System.out.println("El numero introducido es impar");
		}
		}

}
