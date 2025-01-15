package unidad4.herencia.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libro extends Publicación implements Prestable {

	private ArrayList<String> autores = new ArrayList<>();
	private boolean prestado;
	
	public Libro(int código, String título, int año, String ... autores ) {
		super(código, título, año);
		for (String autor: autores)
			this.autores.add(autor);
	}

	public Libro(int código, String título, String ... autores) {
		super(código, título);
		for (String autor: autores)
			this.autores.add(autor);
	}
	
	public List<String> getAutores() {
		return Collections.unmodifiableList(autores);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
			return "Libro " + super.toString();
	}
	
	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}
}
