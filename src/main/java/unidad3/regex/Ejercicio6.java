package unidad3.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Escribe un programa que utilice un Scanner para extraer y mostrar la dirección de cada
 * hiperenlace de un documento HTML.
 * 
 * La dirección de un hiperenlace se especifica en el parámetro href de una etiqueta <a>:
 * 
 * 				<a … href="hiperenlace" …>
 * 
 * La ruta de acceso al fichero HTML se especificará en un parámetro de línea de comando.
 * 
 */

public class Ejercicio6 {

	public static void main(String[] args) throws FileNotFoundException {
		Pattern pattern = Pattern.compile("\\<a.+?href\\=\"(.*?)\"");
		
		try (Scanner s = new Scanner(new File(args[0]))) {
			
		}
	}

}
