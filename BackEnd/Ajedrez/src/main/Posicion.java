package main;

public class Posicion {

//	ATRIBUTOS
	private int laFila;
	private int laColumna;
	
	
//	CONSTRUCTOR
	public Posicion(int laFila, int laColumna) {
		super();
		this.laFila = laFila;
		this.laColumna = laColumna;
	}
	
	public Posicion(char laFila, char laColumna) {
		super();
		this.laFila = laFila;
		this.laColumna = laColumna;
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
	
	public boolean equals(Posicion posicion) {
		return false;
		
	}
	
	
}
