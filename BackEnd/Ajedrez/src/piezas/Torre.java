package piezas;

import main.Color;
import main.Movimiento;
import main.Pieza;
import main.Tablero;

public class Torre extends Pieza{

	public Torre(Color elColor) {
		super(elColor);
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		// TODO Auto-generated method stub
		return false;
	}


	


	
}
