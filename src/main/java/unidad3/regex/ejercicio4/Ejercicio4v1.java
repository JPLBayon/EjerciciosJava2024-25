package unidad3.regex.ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class Ejercicio4v1 {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Pattern pattern = Pattern.compile(">>\\p{L}+<<(\\d+(?:[.,]\\d{1,2})?):(\\d+)");
		String linea;
		System.out.print("> ");
		double total = 0;
		System.out.println("Compra:");
		while ((linea = in.readLine()) != null) {
			Matcher matcher = pattern.matcher(linea);
			if (matcher.matches()) {
				NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
				Number number = format.parse(matcher.group(1));
				double precio = number.doubleValue();
				double cantidad = Double.parseDouble(matcher.group(2));
				total += precio * cantidad;
				}
			System.out.print("> ");
		}
		System.out.print("Importe total:");
		System.out.println(total);
	}

}
