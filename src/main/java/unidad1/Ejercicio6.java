package unidad1;

/*
 * Escribe un programa que muestre la división de 1234 entre 532, con un
 * formato de salida de 15 dígitos, de los cuales dos se usarán para la
 * parte decimal.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
//		System.out.println("1234 + 532 = " + String.valueOf(1234d / 532d));
		System.out.printf("1234 + 532 = %-15.2f 1234 * 532 = %-15d",  1234d / 532d, 1234 * 532);
	}

}
