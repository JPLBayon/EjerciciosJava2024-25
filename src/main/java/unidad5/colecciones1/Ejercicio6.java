package unidad5.colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("> ");
		String linea = in.readLine();
		while (linea != null) {
			try {
				String [] v = linea.split(" ");
				if (v.length != 3)
					throw new RuntimeException("datos incorrectos");
				int n = Integer.parseInt(v[0]);
				int k = Integer.parseInt(v[1]);
				int x = Integer.parseInt(v[2]);
				System.out.println("> ");
				linea = in.readLine();
				if (linea == null)
					break;
				else {
					v = linea.split(" ");
					if (v.length != n)
						throw new RuntimeException("datos incorrectos");
					// crear una cola
				
					// almacenar los números en la cola
					for (String s: v)
						;
				}
			} catch (RuntimeException e) {
				System.out.println("ERROR: " + e.getLocalizedMessage());
			}
			
		}
	}
	
}
