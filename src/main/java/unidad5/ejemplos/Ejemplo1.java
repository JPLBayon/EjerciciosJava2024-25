package unidad5.ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ejemplo1 {

	public static void main(String[] args) {
		Collection<String> c;
		
		c = new ArrayList<>();
		c.add("Carmen");
		c.add("Fernando");
		System.out.println("La lista contiene a Roberto: " + c.contains("Roberto"));
		c.remove("Fernando");
		System.out.println("Número de nombres en la lista: " + c.size());
		System.out.println((((ArrayList<String>)c).indexOf("Carmen"));
		c.clear();
		
		c = new HashSet<>();
		c.add("Elisa");
		c.add("Roberto");
		System.out.println("El conjunto contiene a Roberto: " + c.contains("Roberto"));
		c.remove("Roberto");
		System.out.println("Numero de nombres en el conjunto: " + c.size());
		c.clear();
	}

}
