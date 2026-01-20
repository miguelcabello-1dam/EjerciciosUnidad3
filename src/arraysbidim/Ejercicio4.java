package arraysbidim;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int[][] tablas = new int[10][10];
		
		for (int i=0;i<tablas.length;i++) {
			for (int j=0;j<tablas[0].length;j++) {
				tablas[i][j] = (i+1)*(j+1);
			}
		}
		
		for (int i=0;i<tablas.length;i++) {
			for (int j=0;j<tablas[0].length;j++) {
				System.out.print((j+1) + " x " + (i+1) + " = " + tablas[i][j] + "\t ");
			}
			System.out.println();
		}

	}

}
