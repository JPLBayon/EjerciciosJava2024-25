package unidad2;

import java.util.Random;

/*
 * Escribe un programa que genere mil millones de números aleatorios de tipo long
 * y muestre cuántos pertenecen al intervalo:
 * 
 * 		[-1.000.000.000.000.000.000, 1.000.000.000.000.000.000]
 * 
 * y que muestra también el tiempo empleado en obtener dicho resultado.
 * 
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		Random r = new Random();
		int contador = 0;
		long n;
		long t0 = System.currentTimeMillis();
		for (long i = 0; i < 1000000000L; i++) {
			n = r.nextLong();
			if (n <= 1000000000000000000L && n >= -1000000000000000000L)
				contador++;
		}
		System.out.println("Tiempo empleado: " + (System.currentTimeMillis() - t0));
		System.out.println("Numeros dentro del intervalo: " + contador);
	}

}
