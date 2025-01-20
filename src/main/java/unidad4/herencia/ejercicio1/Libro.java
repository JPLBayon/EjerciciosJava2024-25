package unidad4.herencia.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Libro extends Publicación implements Prestable, Comparable<Libro> {

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
			return "Libro " + super.toString() + " Autores: " +
					autores.stream().collect(Collectors.joining(", ", "[", "]"));
	}
	
	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean estáPrestado() {
		return prestado;
	}

	@Override
	public int compareTo(Libro o) {
		int resultado = this.getTítulo().compareTo(o.getTítulo());
		if (resultado == 0) {
			resultado = this.getCódigo() - o.getCódigo();
			if (resultado == 0) {
				resultado = autoresComparator.compare(this.autores, o.autores);
				if (resultado == 0)
					resultado = this.getAño() - o.getAño();
			}
		}
		return resultado;
	}
	
	static Comparator<ArrayList<String>> autoresComparator = new Comparator<>() {

		@Override
		public int compare(ArrayList<String> o1, ArrayList<String> o2) {
			int min = Integer.min(o1.size(), o2.size());
			int i = 0;
			int resultado;
			while ((resultado = o1.get(i).compareTo(o2.get(i))) == 0 && i < min)
				i++;
			if (resultado == 0 && i == o1.size())
				return -1;
			else if (resultado == 0 && i == o2.size())
				return 1;
			return resultado;
		}
		
	};
}
