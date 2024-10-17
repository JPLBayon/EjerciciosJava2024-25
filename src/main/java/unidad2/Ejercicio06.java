package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Crea un método que acepte un número entero entre 1 y 10 y retorne el resultado de
 * convertirlo a un número romano.
 * 
 * Finalmente, escribe un programa que lo ponga a prueba.
 * 
 */

public class Ejercicio06 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer n;
		while ((n = leerNumero(in)) != null)
			System.out.println(numeroRomano(n));
	}
	
	static Integer leerNumero(BufferedReader in) throws IOException {
		System.out.println("Introduce un número entre 1 y 10");
		String linea = in.readLine();
		if (linea == null)
			return null;
		else
			return Integer.parseInt(linea);
	}
	
//	static Integer leerNumero(BufferedReader in) throws IOException {
//		Integer n;
//		do {
//			System.out.println("Introduce un número entre 1 y 10");
//			String linea = in.readLine();
//			if (linea == null)
//				return null;
//			else
//				try {
//					n = Integer.parseInt(linea);
//				} catch (NumberFormatException e) {
//					System.out.println("no has introducido un número, inténtalo de nuevo");
//					n = null;
//				}
//		} while (n == null);
//		return n;
//	}
	
	static String numeroRomano(int n) {
		switch (n) {
		case 1:	return "I";
		case 2: return "II";
		case 3: return "III";
		case 4: return "IV";
		case 5: return "V";
		case 6: return "VI";
		case 7: return "VII";
		case 8: return "VIII";
		case 9: return "IX";
		case 10: return "X";
		default: return null;
		}
	}

}
