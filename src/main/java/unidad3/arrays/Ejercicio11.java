package unidad3.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Programa que almacene en un único array los datos de varias secuencias
 * de números enteros que el usuario introducirá por teclado de la forma
 * siguiente:
 * 
 *   • El número de secuencias en la primera línea.
 *   
 *   • A continuación, se leen los datos de las secuencias, que ocuparán
 *     dos líneas por cada una de ellas:
 *     
 *        o En la primera, la cantidad de números de la secuencia.
 *        
 *        o En la segunda, los números de la secuencia separados por
 *          espacios.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		//leer los datos introducidos
		Scanner in = new Scanner(System.in);
		int numSecuencias = in.nextInt();
		int [][] a = new int [numSecuencias][];
		for (int i = 0; i< numSecuencias;i++) {
			int nEle = in.nextInt();
			a[i] = new int [nEle];
			for (int j = 0; j< nEle ; j++) {
				a[i][j] = in.nextInt();
			}
		}
			
		for (int i = 0; i< numSecuencias;i++)
			System.out.println(Arrays.toString(a[i]));

	}
}
