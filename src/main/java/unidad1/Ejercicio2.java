package unidad1;

/*
 * Dadas las variables a, b, c y d de tipo int, escribe dos expresiones
 * distintas, pero que ambas retornen true si a es menor que b o c es
 * distinto de d.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int a = -9;
		int b = 21;
		int c = -35;
		int d = 51;
		
		System.out.println((a < b) || (c != d));
	}

}
