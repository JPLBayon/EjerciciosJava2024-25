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
	
	
	/*
	 * Método que acepte un vector de números enteros y retorne 
	 * la desviación estándar de los valores almacenados en un
	 * array de números enteros.
	 */
	public static double desviacionEstandar (int [] v) {
		double aux = 0;
		for(int i = 0; i<v.length; i++)
			aux = aux + v[i];
		aux = aux / v.length;
		double aux2 =0;
		for(int j=0; j<v.length; j++)
			aux2 = aux2 + v[j] - aux;
		aux2 = aux2 / (v.length - 1);
		return aux2;
	}
	
	/*
	 * Método que reciba un vector de números enteros y retorne
	 * la mínima diferencia entre dos valores adyacentes.
	 */
	public static int diferenciaMinimaVA (int[]v) {
		int min = Integer.MAX_VALUE;
		int aux;
		for(int i = 0; i < (v.length - 1); i++) {
			aux = v[i] - v[i+1];
			if (aux < min)
				min=aux;
		}
		return min;
	}
		
	/*
	 * Método que reciba un vector de números enteros y retorne otro
	 * vector que almacene el resultado de sumar cada par de valores
	 * almacenados en el primero (el primero con el segundo, el tercero
	 * con el cuarto, etc). Si el vector tiene un número impar de
	 * elementos, el último se almacenará en el vector resultado sin
	 * sumarlo con ningún otro.
	 */
//	static int[] sumaPares(int [] x) {
//		int suma[];
//		if(x.length % 2 == 0) {
//			suma = new int [x.length / 2];
//		}
//		else {
//			suma = new int [(x.length / 2) + 1];
//		}
//		for(int i = 0 ; i < x.length ; i+=2) 
//			if((x.length - 1) == i) {
//				suma[i/2] = x[i];
//			}else {
//				suma[i/2] = x[i] + x[i + 1];
//			}
//		return suma;
//	}
	
	static int[] sumaPares(int [] x) {
		int suma[] = new int [x.length % 2 == 0 ? x.length / 2 : x.length / 2 + 1];
		for(int i = 0 ; i < x.length ; i+=2) 
			suma[i/2] = (x.length - 1) == i ? x[i] : x[i] + x[i + 1];
		return suma;
	}
	

	public static void main(String[] args) {
		int[] v = crearVector(10);
		System.out.println(Arrays.toString(v));
		System.out.println(maximo(v));

		String[] n = { "arr", "array", "hsgdh", "array", "julio" };
		System.out.printf("hay %d ocurrencias", contarOcurrencias(n, "array"));
		intercambia(n);
		System.out.println(Arrays.toString(n));
		double de = desviacionEstandar(v);
		System.out.println(de);
		
		int minimo=diferenciaMinimaVA(v);
		System.out.println(minimo);
	}

}
