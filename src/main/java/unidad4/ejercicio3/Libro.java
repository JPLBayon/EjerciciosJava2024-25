package unidad4.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libro {

	private String título;
	private ArrayList<Autor> autores;
	private float precio;
	private int stock;
	
	public Libro(String título, ArrayList<Autor> autores, float precio, int stock) {
		this.título = título;
		this.autores = autores;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Libro(String título, ArrayList<Autor> autores, float precio) {
		this(título, autores, precio, 1);
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTítulo() {
		return título;
	}

	public List<Autor> getAutores() {
//		return new ArrayList<Autor>(autores);
		return Collections.unmodifiableList(autores);
	}
		
	
}
