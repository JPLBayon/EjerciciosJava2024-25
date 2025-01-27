package unidad5.colecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crea un programa que lea de la entrada estándar una línea de texto
 * y a continuación almacene en una colección las palabras que no se
 * repiten y en otra colección las que sí se repiten. El programa
 * finalizará mostrando el contenido de ambas colecciones.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		String entrada = sc.nextLine();
		while(entrada != null) {
			String[] palabras= entrada.split("\\P{L}+");
			ArrayList<String> repetidas = new ArrayList<String>();
			ArrayList<String> noRepetidas = new ArrayList<String>();
			
             for(String s: palabras) {
            	 if(s)
            	 repetidas.add(s);
            	 noRepetidas.add(s);
            
             }
            	
			
		}

	}

}
