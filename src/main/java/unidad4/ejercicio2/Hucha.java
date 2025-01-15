package unidad4.ejercicio2;

import java.util.Arrays;
import java.util.Objects;

/*
 * Crea la clase Hucha según las especificaciones siguientes:
 * 
 *    • La hucha solo admite monedas de uno y dos euros y billetes
 *      de 5, 10, 20 y 50 euros.
 *      
 *    • La hucha podrá estar abierta o cerrada. Para abrir o cerrar
 *      la hucha se requiere una contraseña.
 *      
 *    • La contraseña se podrá cambiar en cualquier momento.
 *    
 *    • La hucha podrá proporcionar información acerca de la cantidad
 *      de monedas o billetes que almacena de cada clase, así como el
 *      valor total en euros.
 *      
 *    • Se podrán retirar de la hucha monedas o billetes indicando el
 *      tipo y la cantidad que se desea retirar. Si la cantidad solicitada
 *      supera la cantidad almacenada se retirará únicamente la cantidad
 *      disponible.
 *      
 *    • Se podrá retirar de la hucha una cantidad de euros específica
 *      minimizando el número de monedas y billetes que se retirarán.
 *     
 *    • Se podrá construir una hucha vacía, una hucha con una cantidad
 *      específica de monedas y billetes de cada tipo o una hucha con una
 *      cantidad inicial de euros que se desglosará utilizando la mínima
 *      cantidad de monedas y billetes.
 *      
 * Escribir un programa que ponga a prueba la clase Hucha utilizando todos sus constructores
 * y métodos.
 * 
 */

public class Hucha {

	private int [][] desglose = {{1, 2, 5, 10, 20, 50}, {0, 0, 0, 0, 0, 0}};
	private boolean abierta = true;
	private String contraseña;
	
	public Hucha() {}
	
	public Hucha(int tipo, int cantidad) {
		if (tipo < 0 || tipo > 5 || cantidad <= 0)
			throw new IllegalArgumentException("tipo de moneda o billete incorrecto");
		desglose[1][tipo] = cantidad;
	}
	
	public Hucha(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		if (uno <= 0 || dos <= 0 || cinco <= 0 || diez <= 0 || veinte <= 0 || cincuenta <= 0 )
			throw new IllegalArgumentException("tipo de moneda o billete incorrecto");
		desglose[1][0] = uno;
		desglose[1][1] = dos;
		desglose[1][2] = cinco;
		desglose[1][3] = diez;
		desglose[1][4] = veinte;
		desglose[1][5] = cincuenta;
	}
	
	public Hucha(int [] cantidades) {
		if (cantidades.length != 6)
			throw new IllegalArgumentException("tipo de moneda o billete incorrecto");
		for (int i=0; i<cantidades.length; i++) {
			if (cantidades[i] <= 0 )
				throw new IllegalArgumentException("tipo de moneda o billete incorrecto");
			desglose[1][i] = cantidades[i];
		}
	}

	
	public Hucha(String contraseña) {
		setContraseña(contraseña);
	}
	
	public Hucha(int tipo, int cantidad, String contaseña) {
		this(tipo, cantidad);
		setContraseña(contraseña);
	}
	
	public Hucha(int uno, int dos, int cinco, int diez, int veinte, int cincuenta, String contraseña) {
		this(uno, dos, cinco, diez, veinte, cincuenta);
		setContraseña(contraseña);
	}
	
	public Hucha(int [] cantidades, String contraseña) {
		this(cantidades);
		setContraseña(contraseña);
	}
	
	public int get(int tipo) {
		if (tipo < 0 || tipo > 5)
			throw new IllegalArgumentException("tipo de moneda o billete incorrecto");
		return desglose[1][tipo];
	}
	
	public int getCapital() {
		int suma = 0;
		for (int i=0; i<6; i++)
			suma += desglose[1][i] * desglose[0][i];
		return suma;
	}
	
//	public int retirar(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
//		
//	}
	
	private void setContraseña(String contraseña) {
		this.contraseña = contraseña;
		abierta = false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(desglose);
		result = prime * result + Objects.hash(abierta, contraseña);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hucha other = (Hucha) obj;
		return abierta == other.abierta && Arrays.deepEquals(desglose, other.desglose)
				&& Objects.equals(contraseña, other.contraseña);
	}

	@Override
	public String toString() {
		return "Hucha [capital=" + Arrays.toString(desglose) + ", abierta=" + abierta + ", contraseña=" + contraseña
				+ "]";
	}
	
	
}
