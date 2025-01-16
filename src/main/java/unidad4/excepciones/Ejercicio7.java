package unidad4.excepciones;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ejercicio7 {
	Ejercicio7 e = new Ejercicio7();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String opcion;
		while (!(opcion = in.next()).equalsIgnoreCase("fin"))
			try {
				lanzarExcepcion(Integer.parseInt(opcion));
			} catch (RuntimeException | Error e) {
				System.out.println("Excepción uncheked");
				System.out.println(e.getClass());
			} catch (Exception e) {
				System.out.println("Excepción cheked");
				System.out.println(e.getClass());
			}
		in.close();
	}

	static void lanzarExcepcion(int opcion) throws Exception {
		switch (opcion) {
		case 1:
			System.out.println(1 / 0);
			break;
		case 2:
			int[] a = new int[10];
			a[a.length] = a.length;
			break;
		case 3:
			FileInputStream in = new FileInputStream("este fichero no existe");
			break;
		case 4:
			Object o = null;
			System.out.println(o.toString());
			break;
		case 5:
			Ejercicio7 e = new Ejercicio7();
			break;
		default:
			Class.forName("UnaClase");
		}
	}
}
