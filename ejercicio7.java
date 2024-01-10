package ArraysTarea;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int[][] notas = new int[3][5];
		
		for (int trimestre = 0; trimestre < 3; trimestre++) {
	        System.out.println("Ingrese las notas para el trimestre " + (trimestre + 1) + ":");
	        for (int alumno = 0; alumno < 5; alumno++) {
	            System.out.print("Nota para el alumno " + (alumno + 1) + ": ");
	            notas[trimestre][alumno] = sc.nextInt();
	        }
	    }
		
		for (int trimestre = 0; trimestre < 3; trimestre++) {
            double mediaTrimestre = calcularMedia(notas[trimestre]);
            System.out.println("Nota media del grupo en el trimestre " + (trimestre + 1) + ": " + mediaTrimestre);
        }
		
        System.out.print("Ingrese la posición del alumno para calcular su media (0-4): ");
        int posAlumno = sc.nextInt();
        double mediaAlumno = calcularMediaAlumno(notas, posAlumno);
        System.out.println("Nota media del alumno en la posición " + posAlumno + ": " + mediaAlumno);
        
	}
	private static double calcularMedia(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

   
    private static double calcularMediaAlumno(int[][] notas, int posAlumno) {
        int suma = 0;
        for (int trimestre = 0; trimestre < 3; trimestre++) {
            suma += notas[trimestre][posAlumno];
        }
        return (double) suma / 3;
    }
    
}

