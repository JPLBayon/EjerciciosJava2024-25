package unidad4.ejercicios5_6;

public enum Palo {
	TREBOLES('\u2663'), DIAMANTES('\u2666'), PICAS('\u2660'), CORAZONES('\u2665');
	private char simbolo;
	
	Palo (char simbolo){
		this.simbolo = simbolo;
	}
	
	public char getSimbolo() {
		return simbolo;
	}
	
	@Override
	public String toString() {
		return String.valueOf(simbolo);
	}
	
}
