package funcionesbidim;

import java.util.Arrays;
import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int[][] enteros = new int[6][10];
		
		for (int i=0;i<enteros.length;i++) {
			for (int j=0;j<enteros[0].length;j++) {
				enteros[i][j] = aleatorio.nextInt(0,1001);
				System.out.print(enteros[i][j] + "\t ");
			}
			System.out.println();
		}
		
		System.out.println("Minimo & Maximo = " + Arrays.toString(minMax(enteros)));

	}
	
	public static int[] minMax(int[][] tabla) {
		
		int minimo = 0;
		int maximo = 0;
		
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[0].length;j++) {
				if (j == 0 && i == 0 || minimo > tabla[i][j]) {
					minimo = tabla[i][j];
				}
				if (maximo < tabla[i][j]) {
					maximo = tabla[i][j];
				}
			}
		}
		
		int[] minMax = new int[2];
		minMax[0] = minimo;
		minMax[1] = maximo;
				
		return minMax;
	}

}
