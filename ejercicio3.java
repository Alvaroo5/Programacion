package t1.examen;

public class ejercicio3 {

	public static void main(String[] arg) {
		int datos[][] = new int[5][5];
		
		for(int i = 0; i<datos.length; i++) { /*ucle para las filas*/
			for(int j = 0; j<datos.length; j++) { /*Bucle para las columnas*/
				System.out.println(datos[i][j]=(int) (Math.random()*11));
			}
			System.out.println(); 
		}
	}
}
