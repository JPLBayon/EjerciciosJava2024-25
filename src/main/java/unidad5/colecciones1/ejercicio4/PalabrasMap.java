package unidad5.colecciones1.ejercicio4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabrasMap extends TreeMap<Integer, Set<String>> {
	
	private static final Pattern REGEX = Pattern.compile("\\p{L}+");
	
	public PalabrasMap() {}
	
	public PalabrasMap(String s) {
		añadirPalabras(s);
	}
	
//	public Palabras(String s) {
//		Matcher m = REGEX.matcher(s);
//		while (m.find()) {
//			String palabra = m.group();
//			Set<String> set = palabras.computeIfAbsent(palabra.length(), k -> new TreeSet<String>()); 
//			set.add(palabra);
//		}
//	}
	
	public boolean añadirPalabra(String palabra) {
		Integer key = palabra.length();
		Set<String> set = get(key); 
		if (set == null) {
			set = new TreeSet<String>();
			put(key, set);
		}
		return set.add(palabra);
	}
	
	public void añadirPalabras(String s) {
		Matcher m = REGEX.matcher(s);
		while (m.find())
			añadirPalabra(m.group());
	}
	
	public boolean contiene(String palabra) {
		Set<String> set = get(palabra.length());
//		if (set == null)
//			return false;
//		else
//			return set.contains(palabra);
		return !(set == null) && set.contains(palabra);
	}
	
}
