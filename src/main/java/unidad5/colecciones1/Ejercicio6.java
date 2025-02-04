package unidad5.colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Ejercicio6 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> ");
		String linea = in.readLine();
		while (linea != null) {
			try {
				String [] v = linea.split(" ");
				if (v.length != 3)
					throw new RuntimeException("datos incorrectos");
				int n = Integer.parseInt(v[0]);
				int k = Integer.parseInt(v[1]);
				if (k > n)
					throw new RuntimeException("datos incorrectos");
				int x = Integer.parseInt(v[2]);
				System.out.print("> ");
				linea = in.readLine();
				if (linea == null)
					break;
				else {
					v = linea.split(" ");
					if (v.length != n)
						throw new RuntimeException("datos incorrectos");
					// crear una cola
					LinkedList<Integer> cola = new LinkedList<>();
					// almacenar los números en la cola
					for (String s: v)
						cola.offer(Integer.parseInt(s));
					if (!cola.contains(x))
						throw new RuntimeException("datos incorrectos");
					for (int i=0; i<k; i++)
						cola.poll();
					if (cola.isEmpty())
						System.out.println(0);
					else if (cola.contains(x))
						System.out.println(true);
					else {
						int min = Integer.MAX_VALUE;
						while (!cola.isEmpty()) 
							min = Math.min(min, cola.poll());
						System.out.println(min);
					}
				}
			} catch (RuntimeException e) {
				System.out.println("ERROR: " + e.getLocalizedMessage());
			}
			System.out.print("> ");
			linea = in.readLine();
		}
	}
	
}
