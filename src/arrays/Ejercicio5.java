package arrays ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		boolean valorCorrecto = false;
		int max = 0;
		int min = 0;
		int suma = 0;
		
		for (int i = 0; i < num.length; i++) {
			while (!valorCorrecto) {
				try {
					System.out.println("Introduce entero: ");
					num[i] = sc.nextInt(); 
					valorCorrecto = true;
				} catch (InputMismatchException e) {
					System.out.println("Valor no valido");
				} finally {
					sc.nextLine();
				}
			}
			if (i == 1) {
				max = num[i];
				min = num[i];
			}
			suma += num[i];
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
			valorCorrecto = false;
		}
	
		System.out.println("El numero mas alto es: " + max + ", el mas bajo es " + min + " y la suma es: " + suma);
		
		sc.close();
	}
}