package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que calcule el espacio recorrido por un vehículo
 * con una velocidad inicial de 5 m/s y una aceleración de 2 m/s2.
 * 
 */

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {
		final double velocidadInicial = 5;
		final double aceleración = 2;
		double tiempo;
		double distancia;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Tiempo: ");
		tiempo = Double.parseDouble(in.readLine());
		distancia = velocidadInicial * tiempo + 0.5d * aceleración * Math.pow(tiempo, 2d);
		System.out.println("Distancia: " + distancia); 
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Tiempo: ");
//		double t = Double.parseDouble(in.readLine());
//		System.out.println("Distancia: " + (5d * t + 0.5d * 2d * Math.pow(t, 2d))); 
//	}

}
