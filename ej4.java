package u1.entregable1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] arg) {
		int altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura del numero");
		altura = sc.nextInt();
		
		for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 && j == altura - 1) {
                    System.out.print("*");
                } else if (i == altura - 1 && j == 0) {
                    System.out.print("*");
                } else if (i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
