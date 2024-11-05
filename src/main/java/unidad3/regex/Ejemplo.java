package unidad3.regex;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Ejemplo {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("> ");
			while (in.hasNext()) {
				Set<String> palabras = new TreeSet<>();
				try (Scanner s = new Scanner(Ejemplo.class.getResourceAsStream("/quijote.txt"))) {

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
