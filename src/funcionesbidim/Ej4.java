package funcionesbidim;

import java.util.Random;

public class Ej4 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int tamaño = 3;
		
		int[][] enteros = new int[tamaño][tamaño];
		
		for (int i=0;i<tamaño;i++) {
			for (int j=0;j<tamaño;j++) {
				enteros[i][j] = aleatorio.nextInt(0,3);
				System.out.print(enteros[i][j] + "\t ");
			}
			System.out.println();
		}
		
		System.out.println("La matriz es magica: " + esMagica(enteros));

	}
	
	public static boolean esMagica(int[][] tabla) {
		int[] filas = new int[tabla.length];
		int[] columnas = new int[tabla[0].length];
		
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[0].length;j++) {
				filas[i] += tabla[i][j];
				columnas[j] += tabla[i][j];
			}
		}
		
		boolean magica = true;
		
		for (int i=0;i<tabla.length;i++) {
			if (filas[0] != filas[i]) {
				magica = false;
			}
			if (columnas[0] != columnas[i]) {
				magica = false;
			}
		}
		
		return magica;
		
	}

}
