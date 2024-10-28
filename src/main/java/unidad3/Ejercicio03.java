package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea dos cadenas y muestre el número de veces que la segunda
 * está contenida en la primera.
 * 
 */

public class Ejercicio03 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Texto 1: ");
		String s1 = in.readLine().toLowerCase();
		System.out.println("Texto 2: ");
		String s2 = in.readLine().toLowerCase();
		int c = 0;
		int i = 0;
		
		while((i = s1.indexOf(s2,i)) != -1) {
			c++;
			i++;
		}
		
//		if (c == 1) {
//			System.out.println("La cadena esta 1 vez contenida");
//		} else {			
//			System.out.println("La cadena esta " + c + " veces contenida");
//		}
		
		System.out.println("La cadena esta " + c + " ve" + (c == 1 ? "z" : "ces") + " contenida");
		
	}

}
