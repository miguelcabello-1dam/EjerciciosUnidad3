package funcionesbidim;

import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int[][] enteros = new int[3][3];
		
		for (int i=0;i<enteros.length;i++) {
			for (int j=0;j<enteros[0].length;j++) {
				enteros[i][j] = aleatorio.nextInt(0,3);
				System.out.print(enteros[i][j] + "\t ");
			}
			System.out.println();
		}
		
		System.out.println("La matriz es simétrica: " + comprobarSimetria(enteros));

	}
	
	public static boolean comprobarSimetria(int[][] tabla) {
		
		boolean simetria = true;
		
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[0].length;j++) {
				if (tabla[i][j] != tabla[j][i]) {
					simetria = false;
				}
			}
		}
		
		return simetria;
	}

}
