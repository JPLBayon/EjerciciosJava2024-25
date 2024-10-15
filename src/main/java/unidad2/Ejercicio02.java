package unidad2;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio02 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		double x1, y1, r1, x2, y2, r2;
//		System.out.print("Coordenada x de la primera circunferencia: ");
//		x1 = Double.parseDouble(in.readLine());
//		System.out.print("Coordenada y de la primera circunferencia: ");
//		y1 = Double.parseDouble(in.readLine());
//		System.out.print("Radio de la primera circunferencia: ");
//		r1 = Double.parseDouble(in.readLine());
//		System.out.print("Coordenada x de la segunda circunferencia: ");
//		x2 = Double.parseDouble(in.readLine());
//		System.out.print("Coordenada y de la segunda circunferencia: ");
//		y2 = Double.parseDouble(in.readLine());
//		System.out.print("Radio de la segunda circunferencia: ");
//		r2 = Double.parseDouble(in.readLine());
//		String resultado = relación(x1, y1, r1, x2, y2, r2);
//		System.out.println(resultado);
//	}
//
//	static String relación(double x1, double y1, double r1, double x2, double y2, double r2) {
//		double sumaRadios = r1 + r2;
//		double diferencia = Math.abs(r1 - r2);
//		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//		if (distancia > sumaRadios) {
//			return "exteriores";
//		}
//		else {
//			if (distancia == sumaRadios) {
//				return "tangentes exteriores";
//			}
//			else {
//				if (distancia < sumaRadios && distancia > diferencia) {
//					return "secantes";
//				}
//				else {
//					if (distancia == diferencia) {
//						return "tangentes interiores";
//					}
//					else {
//						if (distancia < diferencia) {
//							return "interiores";
//						}
//						else {
//							return "concéntricas";
//						}
//					}
//				}
//			}
//		}
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double x, y;
		Point2D.Double c1;
		double r1;
		Point2D.Double c2;
		double r2;
		System.out.print("Coordenada x de la primera circunferencia: ");
		x = Double.parseDouble(in.readLine());
		System.out.print("Coordenada y de la primera circunferencia: ");
		y = Double.parseDouble(in.readLine());
		c1 = new Point2D.Double(x, y);
		System.out.print("Radio de la primera circunferencia: ");
		r1 = Double.parseDouble(in.readLine());
		System.out.print("Coordenada x de la segunda circunferencia: ");
		x = Double.parseDouble(in.readLine());
		System.out.print("Coordenada y de la segunda circunferencia: ");
		y = Double.parseDouble(in.readLine());
		c2 = new Point2D.Double(x, y);
		System.out.print("Radio de la segunda circunferencia: ");
		r2 = Double.parseDouble(in.readLine());
		String resultado = relación(c1, r1, c2, r2);
		System.out.println(resultado);
	}

	static String relación(Point2D.Double c1, double r1, Point2D.Double c2, double r2) {
		double sumaRadios = r1 + r2;
		double diferencia = Math.abs(r1 - r2);
		double distancia = c1.distance(c2);
		if (distancia > sumaRadios) {
			return "exteriores";
		}
		else {
			if (distancia == sumaRadios) {
				return "tangentes exteriores";
			}
			else {
				if (distancia < sumaRadios && distancia > diferencia) {
					return "secantes";
				}
				else {
					if (distancia == diferencia) {
						return "tangentes interiores";
					}
					else {
						if (distancia < diferencia) {
							return "interiores";
						}
						else {
							return "concéntricas";
						}
					}
				}
			}
		}
	}

}
