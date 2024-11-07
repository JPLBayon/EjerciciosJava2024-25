package unidad3.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("URL: ");
			URL url = new URL(in.readLine());	
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			try (Scanner s = new Scanner(con.getInputStream())) {
				
			}
		}
	}

}
