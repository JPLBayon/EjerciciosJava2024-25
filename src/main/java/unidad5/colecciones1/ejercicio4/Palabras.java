package unidad5.colecciones1.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palabras {
	
	private Map<Integer, Set<String>> palabras = new HashMap<>();
	private static final Pattern REGEX = Pattern.compile("\\p{L}+");
	
	public Palabras() {}
	
//	public Palabras(String s) {
//		Matcher m = REGEX.matcher(s);
//		while (m.find()) {
//			String palabra = m.group();
//			Set<String> set =palabras.get(palabra.length()); 
//			if (set == null) {
//				Integer key = palabra.length();
//				set = new TreeSet<String>();
//				palabras.put(key, set);
//			}
//			set.add(palabra);
//		}
//	}
	
	public Palabras(String s) {
		Matcher m = REGEX.matcher(s);
		while (m.find()) {
			String palabra = m.group();
			Set<String> set = palabras.computeIfAbsent(palabra.length(), k -> new TreeSet<String>()); 
			set.add(palabra);
		}
	}
	
	public Map<Integer, Set<String>> get() {
		return palabras;
	}
	
	public static void main(String[] args) {
		Palabras palabras = new Palabras("hola Mundo");
		System.out.println(palabras.get());
	}
	
}
