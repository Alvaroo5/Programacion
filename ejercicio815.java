package daw1.comienzo;

import java.util.Scanner;

public class ejercicio815 {

	public static void main(String[] arg) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Ingresa un numero: ");
		    int n = sc.nextInt();
		    int numprimo = 0;
		    
		    for (int i = 1; i <=n; i++) {
		      int divisibles = 0;  

		      //comprobamos cuantos divisibles tiene i
		      for (int j = 1; j <=i; j++) {
		        if ((i % j) == 0) {
		          divisibles++;
		        }
		      }
		      if (divisibles == 2) {
		        System.out.println(i + "-> primo");
		        numprimo++;
		      } else {
		        System.out.println(i + "-> no primo");
		      }
		    }
		    System.out.println("Entre 1 y " + n + " hay " + numprimo + " numeros primos");
		
	}
}
