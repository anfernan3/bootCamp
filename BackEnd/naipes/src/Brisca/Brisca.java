package Brisca;

import naipes.BarajaEspañola;
import naipes.Cartas;
import naipes.Juego;

public class Brisca extends BarajaEspañola implements Juego {

	
//	CONSTRUCTOR
	
	public Brisca() {
		super();
		BarajaEspañola be = new BarajaEspañola();
	}

	

//	METODOS
	@Override
	public void barajar() {
		super.barajar();
	}



	@Override
	public Cartas[] repartir(int numNaipes) {
		return super.repartir(numNaipes);
	}



	@Override
	public Cartas siguienteNaipe() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
