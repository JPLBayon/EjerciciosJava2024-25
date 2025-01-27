package unidad4.anidadas;

public class A {

	private int n = 10;
	static private double d; 
	
	static {
		d = 10;
		class G {
			void m1() {
				System.out.println(n);
			}
		}
	}
	
	{
		n = 20;
		class H {
			void m1() {
				System.out.println(n);
			}
		}
	}
	
	public void m1() {
		
		class D {
			void m1() {
				System.out.println(n);
			}
		}
		
		D x = new D();
		
	}
	
	static public void m2() {
		
		class F {
			void m1() {
				System.out.println(n);
			}
		}
		
		F x = new F();
		
	}
	
	public static class B {
		public void m1() {
			System.out.println(d);
			System.out.println(n);
		}
	}
	
	public class C {
		public void m1() {
			System.out.println(d);
			System.out.println(n);
		}
	}
	
}
