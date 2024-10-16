package unidad2;

/*
 * Crea un método que acepte un número entero n y retorne la suma de la serie
 * 1/1+1/2+1/3+⋯+1/𝑁.
 * 
 * Crea un programa que ponga a prueba este método con diferentes valores de n
 * leídos por teclado y finalice cuando el usuario introduzca un número menor o
 * igual que cero.
 * 
 */

public class Ejercicio16 {

	public static void main(String[] args) {
		System.out.println(suma(100000000000L));
	}
	
//	static double suma(int n) {
//		double suma = 0;
//		for (int i=1; i<=n; i++)
//			suma += 1d / i;
//		return suma;
//	}
	
	static double suma(long n) {
		if (n == 1)
			return 1;
		else
			return 1d / n + suma(n - 1);
	}

}
