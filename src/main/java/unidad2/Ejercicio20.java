package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que pida un número n por teclado y dibuje en la consola
 * triángulos usando asteriscos.
 * 
 * Por ejemplo, para n=4 se dibujarán los triángulos siguientes:
 * 
 * 		****	****	*		  *	      * 	  *******
 * 		***      ***    **       **      ***       *****
 * 		**        **    ***     ***     *****       ***
 * 		*          *    ****   ****    *******       *
 */

public class Ejercicio20 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("n: ");
		int n = Integer.parseInt(in.readLine());
		int asteriscos = n;
		for (int i=0; i<n; i++) {
			for (int j=0; j<asteriscos; j++) 
				System.out.print('*');
			asteriscos--;
			System.out.println();
		}
		
	}

}
