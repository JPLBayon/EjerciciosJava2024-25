package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Programa que realice las tareas siguientes:
 * 
 * 	a) Crear un vector de números enteros de un tamaño aleatorio comprendido
 * 	   entre 10 y 50 elementos.
 *  
 *  b) Llenar el vector con números aleatorios comprendidos entre -100 y 100
 *     sin repetir ninguno.
 *     
 *  c) Crear un segundo vector que contenga los elementos del anterior almacenados
 *     en orden inverso.
 *     
 *  d) Mostrar ambos vectores en la consola.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		Random r = new Random();
		int vectorA[] = new int[r.nextInt(41) + 10];

		for (int i = 0; i < vectorA.length; i++) {
			
			int n, j;

			do {
				n = r.nextInt(201) - 100;
				j = 0;
				while (j < i && vectorA[j] != n)
					j++;
			} while (j < i);
			
			vectorA[i] = n;
		}

		int vectorB[] = new int[vectorA.length];
		for (int i = 0; i < vectorB.length; i++) {
			vectorB[i] = vectorA[vectorA.length - i - 1];
		}

		System.out.println(Arrays.toString(vectorA));
		System.out.println(Arrays.toString(vectorB));

	}

}
