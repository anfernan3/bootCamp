package Brisca;

import naipes.BarajaEspaņola;
import naipes.Cartas;
import naipes.Juego;

public class Brisca extends BarajaEspaņola implements Juego {

	
//	CONSTRUCTOR
	
	public Brisca() {
		super();
		BarajaEspaņola be = new BarajaEspaņola();
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
