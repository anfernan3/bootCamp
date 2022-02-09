package main;

import java.util.Objects;

public class Posicion {

//	ATRIBUTOS
	private int laFila;
	private int laColumna;

//	CONSTRUCTOR
	public Posicion(int laFila, int laColumna) {
		super();
		if (laFila >= 1 && laFila <= 8) {
			this.laFila = laFila;
		}
		if (laColumna >= 1 && laColumna <= 8) {
			this.laColumna = laColumna;
		}

	}

	public Posicion(char laFila, char laColumna) {
		super();
		if (Character.getNumericValue(laColumna) >= 1 && Character.getNumericValue(laColumna) <= 8) {
			this.laColumna = laColumna;
		}
		if (Character.getNumericValue(laFila) >= 1 && Character.getNumericValue(laFila) <= 8) {
			this.laFila = laFila;
		}

	}

//	GETTER Y SETTER	
	public int getLaFila() {
		return laFila;
	}

	public void setLaFila(int laFila) {
		this.laFila = laFila;
	}

	public int getLaColumna() {
		return laColumna;
	}

	public void setLaColumna(int laColumna) {
		this.laColumna = laColumna;
	}

	// METODOS

	@Override
	public int hashCode() {
		return Objects.hash(laColumna, laFila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return laColumna == other.laColumna && laFila == other.laFila;
	}

}
