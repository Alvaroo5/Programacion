package ArraysTarea;

public class ejercicio8 {

	public static void main(String[] arg) {
		
		int [][] t = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				t[i][j]=i+j;
				
			}
		}
		
		for(int i = 4; i>=0; i--) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.println(t[i][j]);
			}
		}
	}
}
