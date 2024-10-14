package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Escribe un programa que lea las edades de varios alumnos y calcule los datos
 * siguientes:
 * 
 * 		• La suma de todas las edades.
 * 		• La edad media.
 * 		• El número de alumnos menores de edad.
 * 
 * Los resultados se mostrarán después de introducir el último dato y pulsar la
 * combinación de teclas ctrl+d.
 * 
 */

public class Ejercicio14 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Short edad;
		short total = 0;
		short n = 0;
		short media;
		short menores = 0;
		edad = leerEdad(in);
		while (edad != null) {
			total += edad;
			n++;
			if (edad < 18)
				menores++;
			edad = leerEdad(in);
		}
		media = (short) (total / n);
		System.out.println("Suma de todas las edades: " + total);
		System.out.println("Edad media: " + media);
		System.out.println("Número de menores de edad: " + menores);
	}
	
	static Short leerEdad(BufferedReader in) throws IOException {
		System.out.print("Edad: ");
		String linea = in.readLine();
		if (linea == null)
			return null;
		else
			return Short.parseShort(linea);
	}
	
	
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String linea;
//		
//		short edad;
//		short total = 0;
//		short n = 0;
//		short media;
//		short menores = 0;
//		
//		System.out.print("Edad: ");
//		linea = in.readLine();
//		
//		while (linea != null) {
//			edad = Short.parseShort(linea);
//			total += edad;
//			n++;
//			if (edad < 18)
//				menores++;
//			System.out.print("Edad: ");
//			linea = in.readLine();
//		}
//		media = (short) (total / n);
//		System.out.println("Suma de todas las edades: " + total);
//		System.out.println("Edad media: " + media);
//		System.out.println("Número de menores de edad: " + menores);
//	}
	
	
//	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
//		String linea;
//		
//		short edad;
//		short total = 0;
//		short n = 0;
//		short media;
//		short menores = 0;
//		
//		System.out.print("Edades: ");
//		while (in.hasNextInt()) {
//			edad = in.nextShort();
//			total += edad;
//			n++;
//			if (edad < 18)
//				menores++;
//			System.out.print("Edades: ");
//		}
//		media = (short) (total / n);
//		System.out.println("Suma de todas las edades: " + total);
//		System.out.println("Edad media: " + media);
//		System.out.println("Número de menores de edad: " + menores);
//	}
	
	

}
