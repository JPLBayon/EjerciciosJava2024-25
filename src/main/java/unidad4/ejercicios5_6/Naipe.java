package unidad4.ejercicios5_6;

import static unidad4.ejercicios5_6.Rango.*;

public class Naipe {
	
		private Palo palo;
		private Rango rango;
		private int valor;
		
		public Naipe(Palo palo, Rango rango, int valor) {
			this.palo = palo;
			this.rango = rango;
			this.valor = valor;
		}

		public Naipe(Palo palo, Rango rango) {
			this.palo = palo;
			this.rango = rango;
			valor = rango.ordinal();
		}
		
		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

		public Palo getPalo() {
			return palo;
		}

		public Rango getRango() {
			return rango;
		}

		@Override
		public String toString() {
			return rango.toString() + palo.toString();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((palo == null) ? 0 : palo.hashCode());
			result = prime * result + ((rango == null) ? 0 : rango.hashCode());
			result = prime * result + valor;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Naipe other = (Naipe) obj;
			if (palo != other.palo)
				return false;
			if (rango != other.rango)
				return false;
			if (valor != other.valor)
				return false;
			return true;
		}
		
		
}
