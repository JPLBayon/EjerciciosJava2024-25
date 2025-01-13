package unidad4.ejercicios5_6;

public enum Rango {
	DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"), SIETE("7"),
	OCHO("8"), NUEVE("9"), DIEZ("10"), JAKE("J"), QUEEN("Q"), KING("K"), ACE("A");
	
	private String simbolo;
	
	Rango(String simbolo) {
		this.simbolo = simbolo;
	}
	
	@Override
	public String toString() {
		return simbolo;
	}
}
