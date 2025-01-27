package unidad5.colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ejercicio1 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		LinkedList<String> lista = new LinkedList<>();
//		String línea;
//		System.out.println("> ");
//		while ((línea = in.readLine()) != null) {
//			if (!lista.contains(línea))
//				lista.add(línea);
//			System.out.println("> ");
//		}
//		System.out.println(lista);
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> lista = new HashSet<>();
		String línea;
		System.out.println("> ");
		while ((línea = in.readLine()) != null) {
			lista.add(línea);
			System.out.println("> ");
		}
		System.out.println(lista);
	}
	
}
