package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
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
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		URL url = new URI("https://www.gutenberg.org/cache/epub/2000/pg2000.txt").toURL();	
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
			String texto = leerTexto(con.getInputStream());
			if (texto != null) {
				System.out.println(texto);
				try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
					String ini;
					System.out.print("> ");
					while ((ini = in.readLine()) != null) {
						System.out.println(buscarPalabras(texto, ini));
						System.out.print("> ");
					}
				}
			}
		}
	}
		
	static Set<String> buscarPalabras(String texto, String ini) {
		Set<String> palabras = new TreeSet<>();
		try (Scanner s = new Scanner(texto)) {
			Pattern regex = Pattern.compile(ini + "\\w*");
			while (s.findWithinHorizon(regex, 0) != null)
				palabras.add(s.match().group());
		}
		return palabras;
	}
	
	static String leerTexto(InputStream is) {
		StringBuilder sb = new StringBuilder();
		String linea;
		try (BufferedReader in = new BufferedReader(new InputStreamReader(is))) {
			while ((linea = in.readLine()) != null) {
				sb.append(linea);
				sb.append("\n");
			}
		} catch (IOException e) {
			return null;
		}
		return sb.toString();
	}

}
