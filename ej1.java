package u1.entregable1;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] arg) {
		
		final int tope = 100;
		int num;
		float media;
		int mayor = 0;
		int suma = 0;
		int contar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.println("Introduce un numero natural que sea par:");
			num=sc.nextInt();
			if(num>0 && num%2 == 0) { /*Un numero natural es positivo*/
				suma = suma + num;
				contar++; /*Va contado el numero de cifras*/
				
			}else {
				System.out.println("El numero introducido es incorrecto");
			}
		}while(suma<=100); 
			System.out.println("La suma de todos estos numeros a superado al 100");
			System.out.println("Fin");
		
		media = suma/contar; 
		
		System.out.println("La media es "+media);
	}
}
