package unidad1.expresiones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Según Wikipedia:
 * 
 * 		Año bisiesto es el divisible entre 4, salvo que sea año
 * 		secular —último de cada siglo, terminado en «00»—, en
 * 		cuyo caso también ha de ser divisible entre 400.
 * 
 * Basándote en esta definición, crea una expresión Java que se evalúe como
 * true si el valor almacenado en una variable llamada año representa un año
 * bisiesto, y false en caso contrario.
 * 
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int año;
		
		System.out.print("Introduce un año: ");
		año = Integer.parseInt(in.readLine());
		System.out.print("El año " + año);
		System.out.print(año % 4 == 0 & (año % 100 != 0 | año % 400 == 0) ? "" : " no ");
		System.out.println(" es bisiesto");
	}
	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int año;
//		
//		System.out.print("Introduce un año: ");
//		año = in.nextInt();
//		System.out.print("Bisiesto: ");
//		System.out.println(año % 4 == 0 & (año % 100 != 0 | año % 400 == 0));
//	}

}
