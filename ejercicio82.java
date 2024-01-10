package daw1.comienzo;

import java.util.Scanner;

public class ejercicio82 {

	public static void main(String[] arg) {
		int edad;
		int numAlumnos = 0;
		int numAlumnosMayorEdad = 0;
		int sumEdad = 0;
		Scanner sc = new Scanner (System.in);                 
		
		System.out.println("Introduce edad:");
		edad = sc.nextInt();
		
		while(edad > 0) {
			numAlumnos++;
			sumEdad+=edad;
			
			if(edad >= 18)
				numAlumnosMayorEdad++;
			
			System.out.println('\n'+"Introduzca edad: ");
			edad = sc.nextInt();
		}
		
		System.out.println("La suma de las edades es "+sumEdad);
		System.out.println("Numero de alumnos mayores de edad: "+numAlumnosMayorEdad);
		
		if(numAlumnos>0) {
			System.out.println("Media de edad: "+sumEdad/numAlumnos);
		}
	}
}
