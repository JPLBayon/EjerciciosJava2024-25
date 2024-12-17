package unidad4.ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Objects;


/* Crea la clase Animal según las especificaciones siguientes:
 * 
 *    • Los objetos de esta clase son inmutables.
 *    
 *    • Variables de instancia:
 *         o nombre, de tipo String
 *         o fecha, de tipo LocalDate
 *         
 *    • Métodos de instancia:
 *         o Constructor que inicialice el estado del objeto con los valores que
 *           reciba a través de sus parámetros formales.
 *         o Constructor que inicialice el estado del objeto con un nombre que reciba
 *           a través de un parámetro formal y con la fecha actual.
 *         o El método toString retornará la cadena:
 *         				"Nombre: nombre – Edad: edad"
 *         
 * Escribir un programa que ponga a prueba la clase Animal utilizando todos
 * sus constructores y métodos.
*/

public class Animal {

	private String nombre;
	private LocalDate fecha;
	
	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
		fecha = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public long getEdad() {
//		return fecha.until(LocalDate.now(), ChronoUnit.YEARS);
		return ChronoUnit.YEARS.between(fecha, LocalDate.now());
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Edad: " + getEdad();
	}
	
	
	
	
	
}
