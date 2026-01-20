package arraysbidim;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int[][] enteros = new int[4][5];

		int[] sumaFilas = new int[4];
		int[] sumaColumnas = new int[5];
		int total = 0;
		
		for (int i=0;i<enteros.length;i++) {
			for (int j=0;j<enteros[0].length;j++) {
				enteros[i][j] = aleatorio.nextInt(100,1000);
				sumaFilas[i] += enteros[i][j];
				sumaColumnas[j] += enteros[i][j];
				total += enteros[i][j];
			}
		}
 		
		for (int i=0;i<=enteros.length;i++) {
			for (int j=0;j<=enteros[0].length;j++) {
				if (j == 5 && i != 4) {
					System.out.print(sumaFilas[i]);
				} else if (i == 4 && j != 5) {
					System.out.print(sumaColumnas[j] + "\t | \t ");
				} else if (i == 4 && j == 5) {
					System.out.print(total);
				} else {
					System.out.print(enteros[i][j] + "\t | \t ");
				}
			}
			System.out.println();
		}
	}

}
