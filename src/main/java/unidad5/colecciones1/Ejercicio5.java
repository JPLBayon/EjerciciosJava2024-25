package unidad5.colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejercicio5 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = in.readLine();
		int s = Integer.parseInt(linea);
		for (int i =0; i<s; i++) {
			linea = in.readLine();
			String[] x = linea.split(" ");
			int n = Integer.parseInt(x[0]);
			int k = Integer.parseInt(x[1]);
			ArrayList<Integer> num = new ArrayList<>();
			linea = in.readLine();
			x = linea.split(" ");
			for (int it = 0; it < n; it++) {
				num.add(Integer.parseInt(x[it]));

			}
			
		}
		
		
	}
	
	
}
