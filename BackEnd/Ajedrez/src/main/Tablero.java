package main;

import java.util.ArrayList;

public class Tablero extends Pieza {

	private ArrayList<Pieza> piezas;
	String[][] Casillas = new String[8][8];
	
	
	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Tablero(Color elColor) {
		super(elColor);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}
	
	public boolean hayPieza(int x, int y) {
		return false;
		
	}
	public boolean hayPieza(Posicion posicion) {
		return false;
		
	}
	
	public boolean quitaPieza(int x, int y) {
		return false;
	}
	public boolean quitaPieza(Posicion posicion) {
		return false;
	}
	
	public void mover(Movimiento movimiento) {
		
	}
	
	public Object clone() {
		return Casillas;
		
	}
	
	public Color colorEscaque(int x, int y) {
		return null;
		
	}
	
	public boolean hayPiezasEntre(Movimiento movimiento) {
		return false;
		
	}
	
	
	
}


