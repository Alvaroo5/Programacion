package daw1.comienzo;

import java.util.Scanner;

public class ejercicio89 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
        
        int numArbol = 0;
        int alturaMayor = 0;
        int contador = 0;
        int alturaArbol;
        
        System.out.println("Ingresa la altura en centímetros de cada árbol, termina cuando introduzca -1:");
        alturaArbol = sc.nextInt();
        
        while(alturaArbol != -1) {
        		contador+=1;
        		if(alturaArbol>alturaMayor) {
        			alturaMayor=alturaArbol;
        			numArbol=contador-1;
        		}
        		
        		System.out.println("Introduce la altura del siguiente arbol");
        		alturaArbol = sc.nextInt();
        }
		
        System.out.println("El arbol mas alto tiene la etiqueta "+numArbol+" con altura de "+alturaMayor+" centimetros.");
        
	}
}
