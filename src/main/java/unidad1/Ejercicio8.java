package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que calcule el perímetro y el área de un círculo a partir de
 * su radio (r) usando las expresiones siguientes:
 * 
 * 			𝑝𝑒𝑟í𝑚𝑒𝑡𝑟𝑜 = 2𝜋𝑟
 * 			𝑎𝑟𝑒𝑎 = 𝜋𝑟2
 * 
 * Para especificar el valor de 𝜋 usa la expresión Math.PI.
 * 
 */

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		double radio, perimetro, area;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Radio: ");
		radio = Double.parseDouble(in.readLine());
		perimetro = 2d * Math.PI * radio;
		area = Math.PI * radio * radio;
		System.out.println("Perímetro: " + perimetro + "\nÁrea: " + area);
	}

}
