package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que le pregunte al usuario su nombre y a continuación
 * muestre los segundos que ha tardado en contestar con una precisión de milisegundos.
 * 
 */

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dime tu nombre: ");
		long t0 = System.currentTimeMillis();
		String nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		System.out.printf("Hola %s, has tardado %.3f segundos", nombre, (t1-t0)/1000d);
	}

}
