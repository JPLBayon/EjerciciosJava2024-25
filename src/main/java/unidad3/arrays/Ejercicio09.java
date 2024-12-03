package unidad3.arrays;

/*
 * Consideremos un vector de números enteros con índices entre 0 y n.
 * Se define el centro del vector como el índice c que verifica la
 * siguiente propiedad:
 * 
 *               c-1              n
 *                Σ(𝑐−𝑖) * 𝑉[𝑖]  =  Σ(𝑗−𝑐) * 𝑉[𝑗]
 *               i=0            j=c+1
 *               
 * Esta propiedad no siempre se verifica; en ese caso, decimos que
 * el vector no tiene centro.
 * 
 * Crear una clase que defina dos métodos:
 * 
 *     • Un método llamado centro que reciba como parámetro un vector
 *       de números enteros y retorne el índice donde se encuentra su
 *       centro o null si no tiene centro.
 *       
 *     • Un método main que cree un vector de números enteros leídos por
 *       teclado y ponga a prueba el método anterior.
 * 
 */

public class Ejercicio09 {

	public static void main(String[] args) {
		System.out.println(centro(new int[] {6, 2, 3, 0, 1}));
	}

//	static Integer centro(int [] v) {
//		if (v == null || v.length == 0)
//			return null;
//		int sumaIzda, sumaDcha;
//		int c = 0;
//		do {
//			sumaIzda = sumaDcha = 0;
//			for (int i=0; i<c; i++)
//				sumaIzda += (c - i) * v[i];
//			for (int j = c+1; j<v.length; j++)
//				sumaDcha += (j - c) * v[j];
//			if (sumaIzda != sumaDcha)
//				c++;
//		} while (c < v.length && sumaIzda != sumaDcha);
//		return c < v.length ? c : null;
//	}
	
	static Integer centro(int [] v) {
		if (v == null || v.length == 0)
			return null;
		int sumaIzda, sumaDcha;
		for (int c=0; c<v.length; c++) {
			sumaIzda = sumaDcha = 0;
			for (int i=0; i<c; i++)
				sumaIzda += (c - i) * v[i];
			for (int j = c+1; j<v.length; j++)
				sumaDcha += (j - c) * v[j];
			if (sumaIzda == sumaDcha)
				return c;
		} 
		return null;
	}
	
	
}
