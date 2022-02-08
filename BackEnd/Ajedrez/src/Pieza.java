
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


	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		return false;
		
	}
	
	public void mover(Movimiento movimiento, Tablero tablero) {
		
	}
}
