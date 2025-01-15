package unidad4.herencia.ejercicio1;

import java.time.LocalDate;

public abstract class Publicación {

	private int código;
	private String título;
	private int año;
	
	public Publicación(int código, String título, int año) {
		this.código = código;
		this.título = título;
		this.año = año;
	}

	public Publicación(int código, String título) {
		this.código = código;
		this.título = título;
		año = LocalDate.now().getYear();
	}

	public int getCódigo() {
		return código;
	}

	public String getTítulo() {
		return título;
	}

	public int getAño() {
		return año;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
		result = prime * result + código;
		result = prime * result + ((título == null) ? 0 : título.hashCode());
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
		Publicación other = (Publicación) obj;
		if (año != other.año)
			return false;
		if (código != other.código)
			return false;
		if (título == null) {
			if (other.título != null)
				return false;
		} else if (!título.equals(other.título))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + código + "," + título + "," + año + "]";
	}
	
	
}
