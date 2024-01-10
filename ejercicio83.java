package daw1.comienzo;

import java.util.Scanner;

public class ejercicio83 {

	public static void main(String[] arg) {
		int numGenerado = (int) ((Math.random()*(100)) + 1);
		int numIntroducido;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		
		
		
		do {
			numIntroducido = sc.nextInt();
			System.out.println("el numero introducido es: "+numIntroducido);
			
			if(numGenerado>numIntroducido) {
				System.out.println("El numero aleatorio es mayor");
			}else if (numGenerado<numIntroducido) {
				System.out.println("El numero aleatorio es menor");
			}else {
				System.out.println("Has acertado");
			}
				
			}while(numIntroducido != numGenerado && numIntroducido != -1);
	}
}