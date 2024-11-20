package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {

	static final Random r = new Random();
	
	static int [] crearVector(int n) {
		int [] v = new int[n];
		for (int i=0; i<n; i++)
			v[i] = r.nextInt(1000);
		return v;
	}
	
	static int maximo(int [] v ) {
		int max = Integer.MIN_VALUE;
		for (int i=0; i<v.length; i++)
			if (v[i] > max)
				max = v[i];
		return max;
	}
	
	public static void main(String[] args) {
		int [] v = crearVector(10);
		System.out.println(Arrays.toString(v));
		System.out.println(maximo(v));
	}

}
