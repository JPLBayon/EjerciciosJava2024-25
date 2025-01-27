package unidad5.colecciones1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;
import java.util.function.Consumer;

/*
 * Crea un programa que realice las tareas siguientes:
 * 
 *   • Almacenar en una lista 100 números aleatorios entre 1 y 100 y
 *     mostrarlos todos utilizando uno de los métodos de iteración.
 *     
 *   • Almacenar los números de la lista original en otra colección sin
 *     que se repita ninguno y mostrarlos todos usando un método de
 *     iteración diferente al anterior.
 *     
 *   • Almacenar los números de la lista original en otra colección en la
 *     que se almacenen ordenados y sin que se repita ninguno y mostrarlos
 *     todos usando un método de iteración diferente a los dos anteriores.
 *     
 *   • Mostrar en la consola el número de valores repetidos almacenados en
 *     la lista original. 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		LinkedList<Integer> lista = new LinkedList<>();
		for (int i=0; i<100; i++)
			lista.add(r.nextInt(300) + 1);
		Iterator<Integer> i = lista.iterator();
		while (i.hasNext()) {
			System.out.print(i.next());
			if (i.hasNext())
				System.out.print(", ");
			else
				System.out.println();
		}
		
//		System.out.println(lista
//				.stream()
//				.map(String::valueOf)
//				.collect(Collectors.joining(", ")));
		
		HashSet<Integer> set1 = new HashSet<>(lista);
		for (int n: set1)
			System.out.print(n + " ");
		
		System.out.println();
		
		TreeSet<Integer> set2 = new TreeSet<>(lista);
		set2.forEach(n -> System.out.print(n + " "));
//		set2.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + " ");			
//			}
//		});

		System.out.println("\n" + (lista.size() - set1.size()));
	}

}
