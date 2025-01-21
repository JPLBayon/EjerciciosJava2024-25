package unidad4.herencia.ejercicio1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Libro extends Publicación implements Prestable {

	private Set<String> autores = new TreeSet<>();
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
	
	public Set<String> getAutores() {
		return Collections.unmodifiableSet(autores);
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
	public int compareTo(Publicación o) {
		if (this == o)
			return 0;
		int resultado = super.compareTo(o);
		if (getClass() == o.getClass())
			return autoresComparator.compare(this.autores, ((Libro) o).autores);
		return resultado;
	}
	
	static Comparator<Set<String>> autoresComparator = new Comparator<>() {

		@Override
		public int compare(Set<String> o1, Set<String> o2) {
			Iterator<String> i1 = o1.iterator();
			Iterator<String> i2 = o2.iterator();
			int resultado = 0;
			while (i1.hasNext() && i2.hasNext() &&
					(resultado = i1.next().compareTo(i2.next())) == 0);
			if (i1.hasNext())
				return 1;
			else if (i2.hasNext())
				return -1;
			return resultado;
		}
		
	};
}
