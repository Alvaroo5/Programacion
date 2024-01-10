package daw1.comienzo;

import java.util.Scanner;

public class ejercicio810 {

	public static void main(String[] arg) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
            System.out.print("Introduce un número entre 1 y 10: ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Tabla de multiplicar del " + num + ":");

        for (int i=1; i<=10; i++) {
            int resultado = num*i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
		
		
		
	}
}
