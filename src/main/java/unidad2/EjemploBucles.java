package unidad2;
import java.util.Scanner;

public class EjemploBucles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
//		do {
//			System.out.println("Número: ");
//			n = in.nextInt();
//			if (n >= 0)
//				System.out.println(Math.sqrt(n));
//		} while (n > -1);
		
//		System.out.println("Número: ");
//		n = in.nextInt();
//		while (n > -1) {
//			System.out.println(Math.sqrt(n));
//			System.out.println("Número: ");
//			n = in.nextInt();
//		}
		
		System.out.println("Número: ");
		while ((n = in.nextInt()) > -1) {
			System.out.println(Math.sqrt(n));
			System.out.println("Número: ");
		}
	}

}
