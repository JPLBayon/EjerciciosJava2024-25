package unidad4.herencia.ejercicio2;

import java.util.Arrays;

import unidad4.herencia.ejercicio1.Libro;
import unidad4.herencia.ejercicio1.Publicación;
import unidad4.herencia.ejercicio1.Revista;

public class PruebaPublicaciones {

	public static void main(String[] args) {
		Libro l1 = new Libro(3, "C", 2000, "C");
		Libro l2 = new Libro(1, "A", 2000, "A");
		Libro l3 = new Libro(2, "B", 2000, "B");
		Revista r1 = new Revista(4, "E", 2010, 1, 12, 3);
		Publicación [] publicaciones = {l1, r1, l2, l3};
		System.out.println(Arrays.toString(publicaciones));
		Arrays.sort(publicaciones);
		System.out.println(Arrays.toString(publicaciones));
	}

}
