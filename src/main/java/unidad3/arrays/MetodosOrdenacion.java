package unidad3.arrays;

import java.util.Arrays;

public class MetodosOrdenacion {

	static void insercionDirecta(int [] v) {
		for (int i=1; i<v.length; i++) {
			int j = 0;
			while (v[j] < v[i])
				j++;
			if (j < i) {
				int aux = v[i];
				for (int k=i-1; k>=j; k--)
					v[k + 1] = v[k];
				v[j] = aux;
			}
		}
	}
	
	static void intercambioDirecto(int [] v) {
		for (int i=0; i < v.length; i++) {
			for (int j = i+1; j< v.length; j++)
				if (v[j] < v[i]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
		}
	}
	
	static void seleccionDirecta(int[] v) {
		for (int i=0; i<v.length; i++) {
			int indice=i;
			for(int j=i+1;j<v.length;j++) {
				if(v[j]<v[indice]) {
					indice=j;
				}
			}
			if(i!=indice) {
				int aux=v[i];
				v[i]=v[indice];
				v[indice]=aux;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		int [] v = {44, 55, 12, 42, 94, 18, 6, 67}; 
		System.out.println(Arrays.toString(v));
		int [] v1 = Arrays.copyOf(v, v.length);
		int [] v2= Arrays.copyOf(v, v.length);
		insercionDirecta(v1);
		System.out.println(Arrays.toString(v1));
		seleccionDirecta(v2);
		System.out.println(Arrays.toString(v2));
		
	}

}
