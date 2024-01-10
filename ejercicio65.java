package daw1.comienzo;

import java.util.Scanner;

public class ejercicio65 {
	public static void main(String [] arg) {
		float radio;
		int pulsar = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el readio de la circunferencia;");
		radio=sc.nextFloat();
		
		int diametro = (int) (2*radio);
		int perimetro = (int) (2*3.14*radio);
		int area = (int) (3.14*radio*radio);
		
		System.out.println("Pulse 1 para calcular el diametro");
		System.out.println("Pulse 2 para calcular el perimetro");
		System.out.println("Pulse 3 para calcular el area");
		
		switch(pulsar) {
		case 1: System.out.println( "El resultado del diametro es: "+diametro ); break;
        case 2: System.out.println( "El resultado del perimetro: "+perimetro ); break;
        case 3: System.out.println( "El resultado del area es: "+area ); break;
		}
	}
}
