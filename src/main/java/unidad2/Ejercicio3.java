package unidad2;

import java.util.Scanner;

/*
 * Crea un método que acepte un número entero y retorne true si es par o false
 * si es impar.
 * 
 * Finalmente, escribe un programa que lo ponga a prueba.
 * 
 */

public class Ejercicio3 {
	
	static boolean esPar (int numero) {
		return numero % 2 == 0;
//		if (numero % 2 == 0)
//			return true;
//		else
//			return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Número: ");
		int numero = s.nextInt();
		boolean par = esPar(numero);
		if (!par)
			System.out.println("El número es impar");
		else
			System.out.println("El número es par");
		
	}

}
