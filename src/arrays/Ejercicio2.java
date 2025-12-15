package arrays ;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double decimales[] = new double[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Introduce un numero decimal: ");
			decimales[i] = sc.nextDouble();
		}
		
		System.out.println("---------------");
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(decimales[i]);
		}
		
		sc.close();
	}
}