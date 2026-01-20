package funcionesbidim;

public class Ej5 {

	public static void main(String[] args) {
		
		int tamaño = 4;
		
		int[][] enteros = new int[tamaño][tamaño];
		
		int num = 1;
		for (int i=0;i<tamaño;i++) {
			for (int j=0;j<tamaño;j++) {
				enteros[i][j] = num;
				num++;
				System.out.print(enteros[i][j] + "\t ");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		int[][] tablaGirada = gira90(enteros);
		
		for (int i=0;i<tamaño;i++) {
			for (int j=0;j<tamaño;j++) {
				System.out.print(tablaGirada[i][j] + "\t ");
			}
			System.out.println();
		}

	}
	
	public static int[][] gira90(int tablaInicio[][]) {
		
		int[][] tablaGirada = new int[tablaInicio.length][tablaInicio[0].length];
		
		for (int i=0;i<tablaGirada.length;i++) {
			for (int j=0;j<tablaGirada[0].length;j++) {
				tablaGirada[i][j] = tablaInicio[(tablaGirada.length-1-j)][i];
			}
		}
		
		return tablaGirada;
	}

}
