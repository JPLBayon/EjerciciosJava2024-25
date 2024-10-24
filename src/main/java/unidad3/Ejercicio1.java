package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programa que lea una cadena de teclado y muestre por pantalla el número de veces
 * que aparece cada vocal en ella.
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Texto: ");
		String s = in.readLine().toLowerCase();
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int k=0; k<s.length(); k++) {
			char c = s.charAt(k);
			switch (c) {
				case 'a', 'á': a++; break;
				case 'e', 'é': e++; break;
				case 'i', 'í': i++; break;
				case 'o', 'ó': o++; break;
				case 'u', 'ú', 'ü': u++; break;
			}
		}
		System.out.println("Número de veces que se repite la vocal 'a': " + a);
		System.out.println("Número de veces que se repite la vocal 'e': " + e);
		System.out.println("Número de veces que se repite la vocal 'i': " + i);
		System.out.println("Número de veces que se repite la vocal 'o': " + o);
		System.out.println("Número de veces que se repite la vocal 'u': " + u);
		
	}

}
