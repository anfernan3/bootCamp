package main;

public abstract class Pieza {

	
//	ATRIBUTOS
	
	private Color elColor;
	
	
//	CONSTRUCTOR
	public Pieza(Color elColor) {
		super();
		this.elColor = elColor;
		
	}
	
//	GETTER Y SETTER
	
	public Color getElColor() {
		return elColor;
	}

	public void setElColor(Color elColor) {
		this.elColor = elColor;
	}

	
//	METODOS


	protected abstract boolean esValido(Movimiento movimiento, Tablero tablero);
	
	public void mover(Movimiento movimiento, Tablero tablero) {
		if(movimiento.getPosIni()==movimiento.getPosFin()) {
			
		}else {
			tablero.mover(movimiento);
		}
	}
}
