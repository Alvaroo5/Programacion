package daw1.comienzo;

import java.util.Scanner;

public class ejercicio56 {

	public static void main (String[] arg){

		final float gravedad = (float) 9.8;
		float tiempo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el valor del tiempo");
		tiempo = sc.nextFloat();

		if(tiempo<=0){
		System.out.println("Tiempo incorrecto");
		}

		float velocidad = (float) (gravedad*tiempo);

		System.out.println("La velocidad es: "+velocidad);

		}

}
