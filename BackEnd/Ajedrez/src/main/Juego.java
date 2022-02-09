package main;

import piezas.PromocionEventArgs;
import piezas.Torre;

public class Juego  extends Tablero{

	public Juego(Color elColor) {
		super(elColor);
		// TODO Auto-generated constructor stub
	}

	private Tablero elTablero;
	private Color elTurno;
	private boolean partidaActiva = false;
	
	
	public Tablero getElTablero() {
		return elTablero;
	}
	public void setElTablero(Tablero elTablero) {
		this.elTablero = elTablero;
	}
	public Color getElTurno() {
		return elTurno;
	}
	public void setElTurno(Color elTurno) {
		this.elTurno = elTurno;
	}
	
	
	public void inicializar() {
		
		Torre torreBlanca1 = new Torre(getElColor().BLANCO);
		Torre torreBlanca2 = new Torre(getElColor().BLANCO);
	}
	
	public void jugada(String string) {
		
	}
	
	public void mover(Movimiento movimiento) {
		
	}
	
	private void cambiaTurno() {
		
	}
	
	private void promocionaPeon(Object object, PromocionEventArgs promocionEventArgs) {
		
	}
}
