package unidad4.ejercicio7;

public class Automovil {
	private String modelo;
	private float capacidad; //capacidad del deposito en litros
	private float cantidad; //cantidad de litros en deposito
	private float consumo; //consumo por kilometros en litros
	private float kmRec; //kilometros recorridos
	private float cmbCons; //combustible consumido
	
	//Constructores
	public Automovil(String modelo, float capacidad, float cantidad, float consumo, float kmRec, float cmbCons) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.cantidad = cantidad;
		this.consumo = consumo;
		this.kmRec = kmRec;
		this.cmbCons = cmbCons;
	}

	public Automovil(String modelo, float capacidad, float consumo) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.consumo = consumo;
		llenarDeposito();
	}
	public void llenarDeposito() {
		cantidad=capacidad;
	}
	public float llenarDeposito(float n) {
		cantidad=n+cantidad;
		float sobrante= cantidad-capacidad;
		if(sobrante <=0)
			return 0;
		cantidad=capacidad;
		return sobrante;
	}
	
}
