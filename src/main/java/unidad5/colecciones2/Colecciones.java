package unidad5.colecciones2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>(Set.of("a", "aa", "aaa", "aaaa", "aaaaa"));
		eliminarLasDeLongitudPar(conjunto);
		System.out.println(conjunto);
		Set<Integer>c2 = Set.of(0,2,4,10,6,20);
		System.out.println(contieneImpares(c2));
	}
	
	/*
	 * Método llamado eliminarLasDeLongitudPar que acepte un conjunto
	 * de cadenas y elimine del mismo todas aquellas cadenas de una 
	 * longitud par. No se permite el uso de ninguna otra estructura de
	 * datos auxiliar.
	 */
	
	static void eliminarLasDeLongitudPar(Set<String> conjunto) {
		Iterator<String> i = conjunto.iterator();
		while (i.hasNext())
			if (i.next().length() % 2 == 0)
				i.remove();
	}
	
	
	/*
	 * Método llamado contieneImpares que acepte un conjunto de números
	 * enteros y retorne true si contiene al menos un número impar o false
	 * en caso contrario.
	 */
	
	static boolean contieneImpares(Set<Integer> conjunto) {
//		Iterator<Integer> i = conjunto.iterator();
//		while (i.hasNext())
//			if (i.next() % 2 != 0)
//				return true;
//		return false;
		return conjunto.stream().anyMatch(n -> n % 2 == 1);
	}
	
	/*
	 * Método llamado valoresUnicos que acepte un mapa de cadenas a cadenas
	 * y retorne false si dos o más claves se asocian a un mismo valor o true
	 * en caso contrario.
	 */
	
	static boolean valoresUnicos(Map<String, String> map) {
		Collection<String> valores = map.values();
		Set<String> set = new HashSet<>(valores);
		return set.size() == valores.size();
		
	}
	
}
