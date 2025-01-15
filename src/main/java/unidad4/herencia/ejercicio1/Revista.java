package unidad4.herencia.ejercicio1;

import java.time.LocalDate;

public class Revista extends Publicación {

	private int número;
	private int mes;
	private int día;
	
	

	public Revista(int código, String título, int año,
			int número, int mes, int día) {
		super(código, título, año);
		this.número = número;
		this.mes = mes;
		this.día = día;
	}

	public Revista(int código, String título, int número) {
		super(código, título);
		this.número = número;
		mes = LocalDate.now().getMonthValue();
		día = LocalDate.now().getDayOfMonth();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + día;
		result = prime * result + mes;
		result = prime * result + número;
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
		Revista other = (Revista) obj;
		if (día != other.día)
			return false;
		if (mes != other.mes)
			return false;
		if (número != other.número)
			return false;
		return true;
	}

	@Override
	public String toString() {
			return "Revista " + super.toString();
	}
	
}
