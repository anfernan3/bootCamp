package piezas;

import java.awt.Event;

import main.Color;
import main.Movimiento;
import main.Posicion;
import main.Tablero;

public class Peon extends main.Pieza {

	public Peon(Color elColor) {
		super(elColor);
		
	}

	public Event promocion(Object obj, PromocionEventArgs promocionEventArgs) {
		return null;		
	}
	
	private boolean avanza(Movimiento movimiento) {
		return false;
		
	}
	
	private boolean inicia(Posicion posicion) {
		return false;
		
	}
	
	private boolean puedeComer(Movimiento movimiento, Tablero tablero) {
		return false;
		
	}
	
	private boolean necesitaPromocion(Posicion posicion) {
		return false;
	}
	

	


	public void mover(Movimiento movimiento, Tablero tablero) {
		
	}
	
	protected void onPromocion(PromocionEventArgs promocionEventArgs) {
		
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		// TODO Auto-generated method stub
		return false;
	}
}
