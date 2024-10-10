package unidad2;

/*
 * Crea un método que acepte dos caracteres cualesquiera y muestre en la consola
 * todos los caracteres comprendidos entre ambos.
 * 
 * A continuación, escribe un programa que lo ponga a prueba.
 * 
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		mostrarCaracteres('h', 'p');
	}
	
	static void mostrarCaracteres(char c1, char c2) {
		for (char i = c1; i <= c2; i++)
			System.out.println(i);
	}

}
