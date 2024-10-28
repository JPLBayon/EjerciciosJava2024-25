package unidad3;

import java.util.Scanner;

/*
 * Escribe un programa que lea secuencias de caracteres con el formato siguiente:
 * 
 * 			LetraNúmeroCarácter.
 * 
 * Por ejemplo, las siguientes son cadenas de este tipo: M135t, b57X, n1335$ o L91.
 * 
 * La entrada puede constar de varias líneas y cada una puede contener cero o más secuencias
 * separadas por espacios en blanco. Cada secuencia se procesará para generar un valor numérico
 * de la forma siguiente:
 * 
 *  •	Si la primera letra es mayúscula, el número que hay entre ella y el último carácter se
 *      multiplicará por el valor numérico de dicho carácter. En caso contrario, en lugar de la
 *      multiplicación se realizará una división.
 *      
 *  •	Si el último carácter es alfabético, se calculará la raíz cuadrada del resultado anterior.
 *      Si es un dígito, se calculará su logaritmo neperiano. En caso contrario se calculará el
 *      resultado de elevar el número de Euler a dicho resultado.
 *      
 *  El programa finalizará, mostrando la suma de todos los valores numéricos obtenidos de cada
 *  secuencia, cuando se detecte en la entrada un EOF.
 *  
 *  Se asume que no se cometen errores en la entrada de datos y todas las secuencias son válidas.

 */

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("> ");
		while (scanner.hasNext()) {
			String s = scanner.next();
			char cInicial = s.charAt(0);
			int centro = Integer.parseInt(s.substring(1, s.length() - 1));
			char cFinal = s.charAt(s.length() - 1);
		}

	}

}
