package Brisca;

import naipes.BarajaEspa�ola;
import naipes.Cartas;
import naipes.Juego;

public class Brisca extends BarajaEspa�ola implements Juego {

	
//	CONSTRUCTOR
	
	public Brisca() {
		super();
		BarajaEspa�ola be = new BarajaEspa�ola();
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
