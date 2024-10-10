package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que pida por teclado un número de mes y muestre el número
 * de días que tiene. Si el usuario no introduce un valor entre 1 y 12, se mostrará
 * un mensaje de error.
 * 
 */

public class Ejercicio4 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Número de mes: ");
//		int mes = Integer.parseInt(in.readLine());
//		switch (mes) {
//		case 4, 6, 9, 11:
//			System.out.println(30);
//			break;
//		case 2:
//			System.out.println("28 o 29");
//			break;
//		default:
//			System.out.println("no has introducido un número de mes");
//			break;
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println(31);
//			
//		}
//	}
	
	public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Número de mes: ");
	int mes = Integer.parseInt(in.readLine());
	switch (mes) {
	case 4: case 6: case 9: case 11:
		System.out.println(30);
		break;
	case 2:
		System.out.println("28 o 29");
		break;
	default:
		System.out.println("no has introducido un número de mes");
		break;
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.println(31);
		
	}
}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Número de mes: ");
//		int mes = Integer.parseInt(in.readLine());
//		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
//			System.out.println(30);
//		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
//				 mes == 8 || mes == 10 || mes == 12)
//			System.out.println(31);
//		else if (mes == 2)
//			System.out.println("28 o 29");
//		else
//			System.out.println("no has introducido un número de mes");
//		}
//	}

}
