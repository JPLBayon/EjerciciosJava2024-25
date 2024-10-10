package unidad2;

import java.util.Random;

/*
 * Escribe un programa que genere números aleatorios y los muestre en la consola
 * hasta que encontrar un número par. Éste último no se mostrará en la consola,
 * pero antes de que finalice el programa se mostrarán los mensajes siguientes:
 * 
 * 		• “se han encontrado n números impares” si se han encontrado 2 o más números
 *        impares, sustituyendo n por la cantidad que corresponda.
 *        
 *      • “se ha encontrado 1 número impar” si sólo se ha encontrado un número impar.
 *      
 *      • “no se han encontrado números impares” sin no se ha encontrado ningún número
 *        impar.
 *        
 */

public class Ejercicio11 {

//	public static void main(String[] args) {
//		Random r = new Random();
//		int contador = 0;
//		int n;
//		do {
//			n = r.nextInt();
//			if (n % 2 != 0) {
//			System.out.println(n);
//				contador++;
//			}
//
//		} while (n % 2 != 0);
//		if (contador == 1) 
//			System.out.println("Se ha encontrado 1 número impar");
//		else if (contador == 0)
//			System.out.println("No se han encontrado números impares");
//		else
//			System.out.println("Se han encontrado " + contador + " números impares");
//
//	}
	
//	public static void main(String[] args) {
//		Random r = new Random();
//		int contador = 0;
//		int n = r.nextInt();
//		while (n % 2 != 0) {
//			System.out.println(n);
//			contador++;
//			n = r.nextInt();
//		}
//		if (contador == 1) 
//			System.out.println("Se ha encontrado 1 número impar");
//		else if (contador == 0)
//			System.out.println("No se han encontrado números impares");
//		else
//			System.out.println("Se han encontrado " + contador + " números impares");
//
//	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int contador = 0, n;
		while ((n = r.nextInt()) % 2 != 0) {
			System.out.println(n);
			contador++;
		}
		if (contador == 1) 
			System.out.println("Se ha encontrado 1 número impar");
		else if (contador == 0)
			System.out.println("No se han encontrado números impares");
		else
			System.out.println("Se han encontrado " + contador + " números impares");

	}

}
