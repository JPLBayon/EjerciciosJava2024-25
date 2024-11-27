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
		String [] v = {
				"________________________________¶1¶1111111¶_______",
				"________¶¶111¶_______________¶¶¶¶111111111¶¶¶1____",
				"_____¶1¶¶¶¶¶111111¶_________¶¶¶1¶¶¶11111111¶1¶¶___",
				"___¶¶¶1¶1111111111¶¶1______¶¶1¶¶¶1111111111111¶¶¶_",
				"__¶¶1¶¶1111111111111¶¶_____¶¶¶1¶¶¶¶1111111111111¶_",
				"__¶¶_¶1111111111111111¶¶___¶¶¶¶¶¶11¶111111111111¶_",
				"_11_¶11111111111111111¶¶_____¶¶¶¶__¶111111111111¶¶",
				"¶¶¶¶1111111111111111¶¶¶¶_____1¶¶__11111111111111¶¶",
				"¶¶¶¶11111111111¶¶¶¶¶¶¶______1¶1¶¶11111111111111¶1_",
				"¶¶1¶1111111111111¶¶¶¶¶¶_____¶¶¶¶¶¶1111111111111¶¶_",
				"¶¶11111111111111111111111¶¶___¶¶¶¶¶¶1111111111¶¶¶_",
				"_1¶111111111111111111¶¶¶¶¶¶____¶¶¶¶11111111111¶1__",
				"__¶¶11111111111111111¶¶¶_____¶¶¶1111111111111¶1___",
				"___¶¶¶111111111111¶1¶¶¶____1¶¶111¶1111111¶11¶1____",
				"____1¶¶¶11111111111¶¶¶¶111¶¶¶¶111111111¶11¶¶¶_____",
				"______¶¶¶¶1111111111111¶¶¶¶1¶¶¶¶¶¶¶¶11¶11¶¶_______",
				"_______¶¶¶¶¶11111111111¶111¶___¶¶¶111¶1¶¶¶________",
				"_________¶¶¶¶¶¶111111111111¶__¶¶¶111¶¶¶1__________",
				"____________1¶¶¶¶¶11111111¶¶_¶¶¶¶111¶¶____________",
				"______________¶¶¶¶¶¶¶1111111_¶¶¶11¶¶1_____________",
				"_________________1¶¶¶¶¶¶1111¶¶¶1¶¶¶¶______________",
				"____________________¶¶¶¶¶¶1¶¶¶¶¶1¶________________",
				"_______________________¶1¶¶¶1¶¶¶__________________",
				"___________________________11¶____________________"};
		
		char [][] dibujo = new char[v.length][];
		for (int i=0; i<v.length; i++)
			dibujo[i] = v[i].toCharArray();
		
		for (String s: v)
			System.out.println(s);
		
		// invocar a rellenar
		
		for (int i=0; i<dibujo.length; i++) {
			for (int j=0; j<dibujo[i].length; j++)
				System.out.print(dibujo[i][j]);
			System.out.println();
		}
			
	}

}
