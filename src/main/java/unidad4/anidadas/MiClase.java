package unidad4.anidadas;

public class MiClase {

	public static void main(String[] args) {
		A.B r = new A.B();
		A r2 = new A();
		A.C r3 = r2.new C();
	}
	
}
