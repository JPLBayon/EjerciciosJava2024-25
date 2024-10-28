package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea líneas de texto por teclado y muestre el resultado de
 * eliminar todos los caracteres duplicados en cada una de ellas.
 * 
 * 		Ejemplo: "teorema del vago: lo intento, pero no lo hago"  ->  "teorma dlvg:in,ph"
 *  
 */

public class Ejercicio14 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> ");
		String linea;
		while ((linea = in.readLine()) != null) {
			StringBuilder aux = new StringBuilder();
			for (int i=0; i<linea.length(); i++)
				if (aux.toString().indexOf(linea.charAt(i)) == -1)
					aux.append(linea.charAt(i));
			System.out.println(aux);
		}
	}

}
