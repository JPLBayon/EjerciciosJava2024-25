package unidad3.arrays;

/*
 * Definir un método rellenar que declare los parámetros formales
 * siguientes:
 * 
 *   • Matriz de caracteres en la que se almacenan letras minúsculas
 *     y dígitos numéricos (a-z, 0-9).
 *     
 *   • Un índice de fila al que llamaremos filaInicial.
 *   
 *   • Un índice de columna al que llamaremos columnaInicial.
 *   
 *   • Un carácter de relleno al que llamaremos caracterRelleno.
 *   
 * El método tendrá que realizar la tarea siguiente:
 * 
 * Comenzando en la posición [filaInicial][columnaInicial] de la matriz
 * donde se encuentra el carácter que llamaremos caracterInicial, se 
 * sustituirá por el caracterRelleno todo carácter de la matriz que cumpla
 * las condiciones siguientes:
 * 
 *   • Es igual a caracterInicial.
 *   • Se puede llegar a él desde la posición [filaInicial][columnaInicial]
 *     atravesando únicamente celdas que contengan el caracterInicial y con
 *     movimientos simples del tipo:
 *     
 *       o desplazarse 1 fila arriba
 *       o desplazarse 1 fila abajo
 *       o desplazarse 1 columna a la izquierda
 *       o desplazarse 1 columna a la derecha
 *       
 * En definitiva, se trata de realizar algo similar a lo que hacen algunos
 * programas de dibujo cuando utilizamos la herramienta de relleno, pero en
 * lugar de rellenar con un color una región de un bitmap, rellenamos con un
 * carácter una región de una matriz.
 * 
 * Para poner a prueba el método se ha de crear un programa que lea de la 
 * entrada estándar los datos necesarios para crear la matriz de caracteres
 * original y los parámetros de relleno según las especificaciones siguientes:
 * 
 *   • En la primera línea el usuario escribirá dos números enteros
 *     F y C, que representarán el número de filas y de columnas de
 *     la matriz.
 *
 *   • En cada una de las siguientes F líneas introducirá una cadena de
 *     longitud C que contendrá los caracteres que se guardaran en cada
 *     una de las F filas de la matriz respectivamente.
 *     
 *   • En la línea siguiente introducirá el carácter de relleno.
 *   
 *   • En las dos últimas filas introducirá el valor para los índices de
 *     fila y columna de la posición inicial dentro de la matriz a partir
 *     de la cual se ha de realizar el relleno.
 *     
 * Una vez leídos los datos de entrada y creada la matriz, la mostrará por
 * pantalla, después invocará al método de relleno con los parámetros 
 * correspondientes y finalmente volverá a mostrar la matriz para ver el
 * resultado del relleno.
 * 
 */

public class Ejercicio16 {

	static void rellenar(char [][] m, int filIni, int colIni, char relleno) {
		
	}
	
	public static void main(String[] args) {
		
	}

}
