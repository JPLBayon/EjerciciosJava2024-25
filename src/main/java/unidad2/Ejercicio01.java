package unidad2;

import java.util.Scanner;

/*
 * Escribe un programa que calcule la división exacta de dos números introducidos
 * por teclado. Si el divisor es cero, se abortará el proceso mostrando un mensaje
 * de error.
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca dos números enteros: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if(num2==0) {
			System.out.println("ERROR");
		}
		else {
			double num3 = num1/num2;
			System.out.println(num3);
		}
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Introduzca dos números enteros: ");
//		double dividendo = sc.nextDouble();
//		double divisor = sc.nextDouble();
//		System.out.println(dividendo / divisor);
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Introduzca dos números enteros: ");
//		int dividendo = sc.nextInt();
//		int divisor = sc.nextInt();
//		System.out.println(dividendo / divisor);
//	}

}
