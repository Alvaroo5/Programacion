package u1.entregable1;

import java.util.Scanner;

public class ej2 {

	public static void main(String [] arg) {
		
		int numAleatorio = (int) ((Math.random()*(25)) + 1); /*generador del numero aleatorio*/
		int numIntroducido;
		int intentosRealizados = 0;
		int intentos;
		String ayuda;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos intentos quieres:");
		intentos = sc.nextInt();
		
		System.out.println("Necesita ayuda: si o no");
		ayuda = sc.next();
		
		
		
		do {
			System.out.println("Introduce un numero:");
			numIntroducido = sc.nextInt();
			
			if(numAleatorio>numIntroducido) {
				System.out.println("El numero aleatorio es mayor");
			}else if (numAleatorio<numIntroducido) {
				System.out.println("El numero aleatorio es menor");
			}else {
				System.out.println("Has acertado");
			}
			
			intentosRealizados++;   /*Se van contando los intentos*/
		
				
			}while(numIntroducido != numAleatorio && numIntroducido != -1 && ayuda!="si" && intentosRealizados<intentos);
		System.out.println("Fin");
		
		
		
	}
}
