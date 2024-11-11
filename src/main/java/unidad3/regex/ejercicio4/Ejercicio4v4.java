package unidad3.regex.ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Escribe un programa que calcule el costo total de diferentes tipos de muebles. Se introducirán
 * los datos necesarios en varias líneas de texto finalizando con la línea "comprar". Para que cada
 * línea sea válida, debe tener el siguiente formato:
 * 
 * 		>>nombre del mueble<<precio:cantidad
 * 
 * Donde:
 * 
 * 		- nombre del mueble es cualquier secuencia de caracteres alfabéticos.
 * 		- precio es un número en notación decimal que puede incluir opcionalmente
 *        un máximo de dos decimales que se separan de la parte entera con una coma.
 *      - cantidad es un número entero en notación decimal.
 *      
 * Una vez finalizada la entrada se imprimirá una lista de muebles comprados y el precio total.
 * 
 */

/*
>>sofá<<543,99:2
>>mesa<<155:1
>silla<<79,5-6
*/

public class Ejercicio4v4 {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		double total = 0;
		System.out.print("> ");
		while ((linea = in.readLine()) != null) {
			Double parcial = analizarLinea(linea);
			if (parcial != null)
				total += parcial;
			System.out.print("> ");
		}
		System.out.print("Importe total:");
		System.out.println(total);
	}

	static NumberFormat format = NumberFormat.getInstance(Locale.getDefault());

	static Double analizarLinea(String linea) {
		int i = 2;
		try (Scanner s = new Scanner(linea)) {
			Double resultado = null;
			next(s, "^>>", ">>");
			i = s.match().end() + 2;
			next(s, "\\p{L}+", "un nombre");
			i = s.match().end() + 2;
			next(s, "<<", "<<");
			i = s.match().end() + 2;
			next(s, "\\d+(?:[.,]\\d{1,2})?", "un precio");
			i = s.match().end() + 2;
			Number number;
			try {
				number = format.parse(s.match().group());
				resultado = number.doubleValue();
			} catch (ParseException e) {
			}
			next(s, ":", ":");
			i = s.match().end() + 2;
			next(s, "\\d+", "una cantidad");
			i = s.match().end() + 2;
			resultado *= Double.parseDouble(s.match().group());
			next(s, "$", "fin de línea");
			return resultado;
		} catch (NoSuchElementException e) {
			System.out.println(" ".repeat(i) + "^");
			System.out.println(e.getMessage());
			System.out.flush();
			return null;
		}
	}
	
	static String next(Scanner s, String regex, String token) {
		try {
			s.skip(regex);
			return s.match().group();
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("ERROR: se esperaba " + token);
		}
		
	}


}
