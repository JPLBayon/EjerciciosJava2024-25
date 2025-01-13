package unidad4.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	
	private ArrayList<Naipe> naipes = new ArrayList<>();
	
	public Mazo() {
		agregarBaraja();
		Collections.shuffle(naipes);
	}
	
	public Mazo(int n) {
		for (int i=0; i<n; i++)
			agregarBaraja();
		Collections.shuffle(naipes);
	}
	
	private void agregarBaraja() {
		for (Palo p: Palo.values())
			for(Rango r: Rango.values()) {
				Naipe naipe = new Naipe(p, r);
				naipes.add(naipe);
			}
	}
	
	public Naipe get() {
		return naipes.getFirst();
	}
	
	public Naipe retirar() {
		return naipes.removeFirst();
	}
	
	public void agregar(Naipe naipe) {
		naipes.add(naipe);
	}
	
	public void agregarTodos(Mazo mazo) {
		this.naipes.addAll(mazo.naipes);
	}
	
	public List<Naipe> getNaipes() {
		return Collections.unmodifiableList(naipes);
	}
	
}
