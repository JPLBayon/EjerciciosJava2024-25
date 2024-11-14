package unidad3.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Programa que simule el lanzamiento de un dado N veces, siendo N un número entero que se
 * introducirá por teclado. Antes de finalizar mostrará el número de veces que salió cada una
 * de las caras.
 * 
 */

public class Ejercicio1 {

//	public static void main(String[] args) throws IOException {
//		Random r = new Random();
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Número de lanzamientos: ");
//		int n = Integer.parseInt(in.readLine());
//		
//		int uno = 0;
//		int dos = 0;
//		int tres = 0;
//		int cuatro = 0;
//		int cinco = 0;
//		int seis = 0;
//		
//		for (int i=0; i<n; i++) {
//			switch(r.nextInt(6)) {
//			case 0: uno++; break;
//			case 1: dos++; break;
//			case 2: tres++; break;
//			case 3: cuatro++; break;
//			case 4: cinco++; break;
//			case 5: seis++; break;
//			}
//		}
//		System.out.println("Numero de veces que salió el 1: " + uno);
//		System.out.println("Numero de veces que salió el 2: " + dos);
//		System.out.println("Numero de veces que salió el 3: " + tres);
//		System.out.println("Numero de veces que salió el 4: " + cuatro);
//		System.out.println("Numero de veces que salió el 5: " + cinco);
//		System.out.println("Numero de veces que salió el 6: " + seis);	
//	}

	public static void main(String[] args) throws IOException {
		Random r = new Random();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Número de lanzamientos: ");
		int n = Integer.parseInt(in.readLine());
		int [] v = new int[6];
		
		for (int i=0; i<n; i++)
			v[r.nextInt(6)]++;
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " -> " + v[i]);
		}
	}
	
}
