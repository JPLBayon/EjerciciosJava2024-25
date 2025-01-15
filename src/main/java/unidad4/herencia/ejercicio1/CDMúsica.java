package unidad4.herencia.ejercicio1;

public class CDMúsica extends Publicación implements Prestable {

	private boolean prestado;
	
	public CDMúsica(int código, String título, int año) {
		super(código, título, año);
		// TODO Auto-generated constructor stub
	}

	public CDMúsica(int código, String título) {
		super(código, título);
		// TODO Auto-generated constructor stub
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
