package unidad4.herencia.ejercicio1;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
//		ArrayList<Publicación> publicaciones = new ArrayList<>();		
//		publicaciones.add(new Libro(1, "A", 2000, "Pepe"));
//		publicaciones.add(new Revista(2, "B", 2010));
//		System.out.println(publicaciones);
		
		ArrayList<Prestable> prestados = new ArrayList<>();
		Libro libro = new Libro(1, "A", 2000, "Pepe");
		libro.prestar();
		prestados.add(libro);
		CDMúsica cd = new CDMúsica(2, "B", 2020);
		cd.prestar();
		prestados.add(cd);
		
		Prestable p = prestados.getFirst();
		if (p instanceof Libro) {
			Libro l = (Libro) p;
			
			
		} else {
			CDMúsica c = (CDMúsica) p;
		
		}
	}
	
}
