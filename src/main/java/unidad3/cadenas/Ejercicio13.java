package unidad3.cadenas;

/*
 * Escribe un método que acepte una cadena y retorne otra obtenida como resultado de
 * intercambiar cada par de caracteres. Si el número de caracteres es impar, el último
 * se queda como está.
 * 
 * 		Ejemplo:  "Hola Mundo!"  ->  "oHalM nuod!"
 *  
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println(intercambiar("Hola Mundo!"));
	}

	static String intercambiar(String s) {
		StringBuilder aux = new StringBuilder();
		
		for (int i=0; i<s.length(); i+=2) {
			if (i != s.length() - 1)
				aux.append(s.charAt(i + 1));
			aux.append(s.charAt(i));
		}
		
		return aux.toString();
	}
}
