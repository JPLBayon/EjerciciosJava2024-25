package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Escribe un programa que genere números aleatorios enteros comprendidos entre
 * 100 y 999 y los vaya sumando hasta que dicha suma supere un valor
 * previamente introducido por teclado.
 * 
 * Mostrar finalmente el valor acumulado y la cantidad de números acumulados.
 * 
 * Versión 2: cómo hacer que el programa funcione aunque el usuario introduzca
 * un número negativo.
 * 
 */

public class Ejercicio12 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Introduce un número entero: ");
//		int n = Integer.parseInt(in.readLine());
//		Random r = new Random();
//		int acumulador = 0;
//		do {
//			acumulador += r.nextInt();
//		} while (acumulador <= n);
//		System.out.println(acumulador);
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un número entero: ");
		int n = Integer.parseInt(in.readLine());
		Random r = new Random();
		int contador = 0;
		int acumulador = 0;
		while (acumulador <= n) {
			acumulador += r.nextInt(900) + 100;
			contador++;
		}
		System.out.println(contador + " - " + acumulador);
	}
	
}
