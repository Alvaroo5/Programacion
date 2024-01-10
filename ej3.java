package u1.entregable1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] arg) {
			String tipo;
			int gourmet;
			int basica;
			float preciodia;
			String dia;
			String pertenece;
			float preciofinal;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el tipo de hamburguesa:");
			System.out.println("1. basica");
			System.out.println("2. gourmet");
			tipo=sc.next();
			
			do {
				System.out.println("Introduce el tipo de hamburguesa:");
				System.out.println("1. basica");
				System.out.println("2. gourmet");
				tipo=sc.next();
				switch(tipo) {
				case "1":
					System.out.println("Introduce el numero de hamburguesas que quiere:");
					basica=sc.nextInt();
					System.out.println("¿Que dia es hoy?");
					dia=sc.next();
					
					if(dia == "miercoles") {
						System.out.println("Hay rebajas!!");
						preciodia = basica*2;
					}else {
						preciodia = basica*3;
					}
					System.out.println("¿Perteneces al club Fanegas de Burbur, si o no?");
					pertenece = sc.next();
					
					if(pertenece == "si") {
						System.out.println("Tienes un descuento!!");
						preciofinal = (float) (preciodia*0.12);
					}else {
						preciofinal = preciodia;
					}
					System.out.println("El precio del pedido seria: "+preciofinal);break;
				case "2":
					System.out.println("Introduce el numero de hamburguesas que quiere:");
					gourmet=sc.nextInt();
					System.out.println("¿Que dia es hoy?");
					dia=sc.next();
					
					if(dia == "martes" && gourmet==2) {
						System.out.println("Hay rebajas!!");
						preciodia=9;
					}else {
						preciodia=gourmet*5;
					}
					System.out.println("¿Perteneces al club Fanegas de Burbur, si o no?");
					pertenece = sc.next();
					
					if(pertenece == "si") {
						System.out.println("Tienes un descuento!!");
						preciofinal = (float) (preciodia*0.12);
					}else {
						preciofinal = preciodia;
					}
					System.out.println("El precio del pedido seria: "+preciofinal);break;
				default: 
					System.out.println("Opcion incorrecta");break;
					
				}
			}while(tipo=="1" || tipo=="2");
			
	}
}

