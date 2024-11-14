package unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo {

	public static void main(String[] args) {
		int [] v = {35, 45, 55};
		System.out.println(v.length);
		int n = v[1];
		System.out.println(n);
		v[2] = 10;
		System.out.println(Arrays.toString(v));
//		v[3] = 0;
		
		Random r = new Random();
		int [] v2 = new int[30];
		for (int i=0; i<v2.length; i++)
			v2[i] = r.nextInt(100);
		System.out.println(Arrays.toString(v2));
		Arrays.sort(v2);
		System.out.println(Arrays.toString(v2));
		int [] v3 = Arrays.copyOf(v2, v2.length);
		System.out.println(Arrays.toString(v3));
		System.out.println(Arrays.binarySearch(v2, 35));
	}

}
