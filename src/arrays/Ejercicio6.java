package arrays ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[8];
		boolean valorCorrecto = false;
		String parImpar;
		
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
			valorCorrecto = false;
		}
	
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				parImpar = "par";
			} else {
				parImpar = "impar";
			}
			System.out.println("El numero " + num[i] + " es " + parImpar);
		}
		
		sc.close();
	}
}