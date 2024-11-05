package unidad3.regex;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Ejemplo {

//	public static void main(String[] args) {
//		try (Scanner in = new Scanner(System.in)) {
//			System.out.print("> ");
//			while (in.hasNext()) {
//				Set<String> palabras = new TreeSet<>();
//				try (Scanner s = new Scanner(Ejemplo.class.getResourceAsStream("/quijote.txt"))) {
//
//					String secuenciaInicial = in.nextLine();
//					Pattern regex = Pattern.compile(secuenciaInicial + "\\w*");
//					String palabra;
//					while ((palabra = s.findWithinHorizon(regex, 0)) != null) {
//						palabras.add(palabra);
//					}
//					System.out.println(palabras);
//				}
//				palabras.clear();
//				System.out.print("> ");
//			}
//		}
//
//	}
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.gutenberg.org/cache/epub/2000/pg2000.txt");	
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("> ");
			while (in.hasNext()) {
				Set<String> palabras = new TreeSet<>();
				try (Scanner s = new Scanner(con.getInputStream())) {

					String secuenciaInicial = in.nextLine();
					Pattern regex = Pattern.compile(secuenciaInicial + "\\w*");
					String palabra;
					while ((palabra = s.findWithinHorizon(regex, 0)) != null) {
						palabras.add(palabra);
					}
					System.out.println(palabras);
				}
				palabras.clear();
				System.out.print("> ");
			}
		}

	}

}
