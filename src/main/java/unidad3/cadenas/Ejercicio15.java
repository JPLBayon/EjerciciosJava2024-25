package unidad3.cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea líneas de texto por teclado y por cada línea leída muestre
 * la subcadena más larga sin caracteres duplicados.
 * 
 */

public class Ejercicio15 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.print("> ");
		while ((linea = in.readLine().trim()) != null) {
			System.out.println(subcadenaMasLargaSinDuplicados(linea));
		}
	}
	
	static String subcadenaMasLargaSinDuplicados(String s) {
		return null;
	}

}
