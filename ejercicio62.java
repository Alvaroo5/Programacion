package daw1.comienzo;

import java.util.Scanner;

public class ejercicio62 {

	public static void main (String[] arg){

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero del 1 al 10:");
		num = sc.nextInt();

		switch(num){
		
		case 1: System.out.println( "Uno" ); break;
        case 2: System.out.println( "Dos" ); break;
        case 3: System.out.println( "Tres" ); break;
        case 4: System.out.println( "Cuatro" ); break;
        case 5: System.out.println( "Cinco" ); break;
        case 6: System.out.println( "Seis" ); break;
        case 7: System.out.println( "Siete" ); break;
        case 8: System.out.println( "Ocho" ); break;
        case 9: System.out.println( "Nueve" ); break;
        case 10: System.out.println( "Diez" ); break;
        default: System.out.println( "No has introducido un numero del 1 al 10" ); break;
		
		}

	}
}
