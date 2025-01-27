package unidad4.anidadas;

import javax.swing.JFrame;

public class J {

	static JFrame ref = new JFrame("Mi App") {
		
	};
	
	public void  m() {
		JFrame ref = new JFrame("Mi App") {
			
		};
	}
}
