package unidad4.ejercicio1;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Pepe");
		Animal animal2 = new Animal("Pepín", LocalDate.of(2009, 10, 23));
		String nombre = animal.getNombre();
		System.out.println(nombre);
		System.out.println(animal);
		System.out.println(animal2);
	}

}
