package unidad4.ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CartaMasAlta {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Mazo mazo = new Mazo();
		while (!mazo.estaVacio() && preguntar().equalsIgnoreCase("si")) {
			Naipe jugador = mazo.retirar();
			Naipe ordenador = mazo.retirar();
			System.out.println("Naipe del jugador: " + jugador);
			System.out.println("Naipe del ordenador: " + dor);
			if (jugador.getValor() > ordenador.getValor())
				System.out.println("Gana el jugador");
			else if (jugador.getValor() < ordenador.getValor())
				System.out.println("Gana el ordenador");
			else
				System.out.println("Empate");
		}
	}
	
	static String preguntar() throws IOException {
		System.out.print("Jugar (si/no): ");
		return in.readLine();
	}
	
}
