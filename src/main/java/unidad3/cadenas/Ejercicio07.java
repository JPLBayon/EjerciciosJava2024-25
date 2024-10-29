package unidad3.cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea nombres y muestre el resultado de sustituir los caracteres
 * centrales (todos menos el primero y el último) por asteriscos. Se ha de tener en cuenta
 * que cada nombre puede estar precedido y/o seguido de un número arbitrario de espacios en
 * blanco que se deben ignorar.
 * 
 * Resolver cada sustitución sin usar sentencias repetitivas.
 * 
 */

public class Ejercicio07 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		System.out.print("Nombre: ");
		while ((nombre = in.readLine().trim()) != null) {
//			String nombre2 = nombre.charAt(0) + "";
//			for (int i=0; i<nombre.length() - 2; i++)
//				nombre2 += '*';
//			nombre2 += nombre.charAt(nombre.length() - 1);
			String nombre2 = nombre.charAt(0) + "*".repeat(nombre.length() - 2) + nombre.charAt(nombre.length() - 1);
			System.out.println(nombre2);
			System.out.print("Nombre: ");
		}
	}

}
