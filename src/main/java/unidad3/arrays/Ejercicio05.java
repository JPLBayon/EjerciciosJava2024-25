package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {

	static final Random r = new Random();

	static int[] crearVector(int n) {
		int[] v = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = r.nextInt(1000);
		return v;
	}

	/*
	 * Método que acepte un vector de números enteros y retorne el valor máximo
	 * almacenado en él.
	 */
	static int maximo(int[] v) {
		int max = Integer.MIN_VALUE;
//		for (int i=0; i<v.length; i++)
//			if (v[i] > max)
//				max = v[i];
		for (int n : v)
			if (n > max)
				max = n;
		return max;
	}

	/*
	 * Método que acepte un vector de números enteros y retorne la media exacta de
	 * todos los valores almacenados en él.
	 */

	static double mediaExacta(int[] v) {
		double suma = 0;
//		for(int i = 0; i<v.length; i++)
//			suma += v[i]; 
		for (int n : v)
			suma += n;
		return suma / v.length;

	}

	/*
	 * Método que acepte dos parámetros, un vector de cadenas y una cadena
	 * individual, y retorne en cuántas de las cadenas almacenadas en el vector está
	 * contenida la cadena individual.
	 */
	static int contarOcurrencias(String[] v, String s) {
		int contador = 0;
		for (String sub : v)
			if (s.contains(sub))
				contador++;
		return contador;
	}

	/*
	 * Método que reciba dos vectores de cadenas y retorne true si ambos son
	 * iguales, es decir, contienen el mismo número de cadenas y las que se
	 * encuentran en la misma posición en ambos vectores son iguales.
	 */
	// No seas inútil(tonto) y usa Arrays.equals

	/*
	 * Método que acepte un vector de cadenas e intercambie lo que hay en la
	 * posición 0 con lo que hay en la posición 1, lo que hay en la 2 con lo que hay
	 * en la 3, etc. Si el array contiene un número impar de cadenas, la última no
	 * se intercambia.
	 */
	static void intercambia(String[] cadena) {
		for (int i = 0; i < cadena.length - 1; i += 2) {
			String aux = cadena[i];
			cadena[i] = cadena[i + 1];
			cadena[i + 1] = aux;
		}
	}
	
	
	/*
	 * Método que acepte un vector de números enteros y retorne el
	 * rango de valores almacenados, entendiendo por rango la diferencia
	 * entre el valor mayor y el valor menor más 1.
	 */
	static int rango(int[] v) {
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int n: v) {
			if (n > mayor)
				mayor = n;
			if (n < menor)
				menor = n;
		}
		return mayor-menor+1;
	}
	

	public static void main(String[] args) {
		int[] v = crearVector(10);
		System.out.println(Arrays.toString(v));
		System.out.println(maximo(v));

		String[] n = { "arr", "array", "hsgdh", "array", "julio" };
		System.out.printf("hay %d ocurrencias", contarOcurrencias(n, "array"));
		intercambia(n);
		System.out.println(Arrays.toString(n));
	}

}
