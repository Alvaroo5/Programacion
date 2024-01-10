package daw1.comienzo;

import java.util.Scanner;

public class ejercicio814 {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();
        
        for (int i=n; i>0; i-=1) { //(i=1; i<=n; i++)
            for (int j=n; j>0; j--) { //(j=1; j<=(n-i)+1; j++)
                System.out.print("*");
            }
            n-=1;
            System.out.println();
        }
	}
}
