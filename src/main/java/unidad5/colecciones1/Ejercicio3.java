package unidad5.colecciones1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Crea un programa que lea de la entrada estándar una línea de texto
 * y a continuación almacene en una colección las palabras que no se
 * repiten y en otra colección las que sí se repiten. El programa
 * finalizará mostrando el contenido de ambas colecciones.
 */

public class Ejercicio3 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("> ");
//		String entrada = sc.nextLine();
//		ArrayList<String> repetidas = new ArrayList<String>();
//		ArrayList<String> noRepetidas = new ArrayList<String>();
//		while (!entrada.isEmpty()) {
//			String[] palabras = entrada.split("\\P{L}+");
//			for (String s : palabras) {
//				if (!noRepetidas.contains(s) && !repetidas.contains(s)) {
//					noRepetidas.add(s);
//				} else if (noRepetidas.contains(s)) {
//						noRepetidas.remove(s);
//						repetidas.add(s);
//				}
//			}
//			System.out.println("Palabras repetidas:" + repetidas);
//			System.out.println("No repetidas: " + noRepetidas);
//			repetidas.clear();
//			noRepetidas.clear();
//			System.out.println("> ");
//			entrada = sc.nextLine();
//		}
//
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		String entrada = sc.nextLine();
		TreeSet<String> repetidas = new TreeSet<String>();
		TreeSet<String> noRepetidas = new TreeSet<String>();
		Pattern regex = Pattern.compile("\\p{L}+");
		while (!entrada.isEmpty()) {
			Matcher m = regex.matcher(entrada);
			while (m.find()) {
				String s = m.group();
				if (!noRepetidas.contains(s) && !repetidas.contains(s)) {
					noRepetidas.add(s);
				} else if (repetidas.add(s)) {
						noRepetidas.remove(s);
				}
			}
			System.out.println("Palabras repetidas:" + repetidas);
			System.out.println("No repetidas: " + noRepetidas);
			repetidas.clear();
			noRepetidas.clear();
			System.out.println("> ");
			entrada = sc.nextLine();
		}

	}

}
