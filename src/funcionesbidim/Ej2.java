package funcionesbidim;

public class Ej2 {

	public static void main(String[] args) {
		
		int[][] enteros = new int[4][4];
		int num = 1;
		for (int i=0;i<enteros.length;i++) {
			for (int j=0;j<enteros[0].length;j++) {
				enteros[i][j] = num;
				num++;
				System.out.print(enteros[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		transponer(enteros);

	}
	
	public static void transponer(int[][] tabla) {
		
		int[][] transpuesta = new int[tabla.length][tabla[0].length];
		
		for (int i=0;i<transpuesta.length;i++) {
			for (int j=0;j<transpuesta[0].length;j++) {
				transpuesta[i][j] = tabla[j][i];
				System.out.print(transpuesta[i][j] + "\t ");
			}
			System.out.println();
		}
		
	}

}
