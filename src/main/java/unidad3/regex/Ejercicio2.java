package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Escribe un programa que use una expresión regular para encontrar nombres de personas en un
 * texto, teniendo en cuenta que un nombre es válido si cumple las condiciones siguientes:
 * 
 * 		• Está formado por dos o más palabras.
 * 		• Cada palabra comienza por una letra mayúscula seguida de letras minúsculas.
 * 		• Cada palabra debería tener al menos dos letras.
 * 		• Las palabras se separan entre sí por un único espacio en blanco.
 * 
 * El usuario introducirá una línea que contendrá varios nombres separados por comas y los mostrará
 * de nuevo, cada uno en una línea.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Pattern regex = Pattern.compile("(?:\\p{Lu}\\p{Ll}+)(?: \\p{Lu}\\p{Ll}+)+");
		System.out.print("> ");
		String linea;
		while ((linea = in.readLine()) != null) {
			Matcher m = regex.matcher(linea);
			while (m.find())
				System.out.println(m.group());
			System.out.print("> ");
		}
	}

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		Pattern regex = Pattern.compile("(?:\\p{Lu}\\p{Ll}+)(?: \\p{Lu}\\p{Ll}+)+");
//		System.out.print("> ");
//		String linea;
//		String nombre;
//		while ((linea = in.readLine()) != null) {
//			Scanner s = new Scanner(linea);
//			while ((nombre = s.findWithinHorizon(regex, 0)) != null)
//				System.out.println(nombre);
//			System.out.print("> ");
//		}
//	}
	
	
}
