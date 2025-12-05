package arrays ;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		int enteros[] = new int[100];
		int num = 0;
		String posiciones = "";
		
		for (int i=0;i<enteros.length;i++) {
			enteros[i] = aleatorio.nextInt(1, 10);
		}
		
		while (!(num<10 && num>0)) {
			try {
				System.out.println("Introduce un num del 1 al 10: ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor no valido");
			} finally {
				sc.nextLine();
			}
		}
		
		for (int i=0;i<enteros.length;i++) {
			if (enteros[i] == num) {
				if (posiciones.isEmpty()) {
					posiciones = Integer.toString(i);
				} else {
					posiciones += ", " + Integer.toString(i);
				}
			}
		}
		
		if (posiciones.isEmpty()) {
			System.out.println("El numero no ha salido");
		} else {
			System.out.println("El numero esta en las posiciones: " + posiciones);
		}
		
		
		sc.close();
	}
}