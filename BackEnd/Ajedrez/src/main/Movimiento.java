package main;

public class Movimiento {

//	ATRIBUTOS

	private Posicion posIni;
	private Posicion posFin;

//	CONSTRUCTOR
	public Movimiento(String movimiento) {
		if (movimiento != null) {
			this.posIni = posIni;
			this.posFin = posFin;
		}
	}

//	GETTER Y SETTER

	public Posicion getPosIni() {
		return posIni;
	}

	public void setPosIni(Posicion posIni) {
		this.posIni = posIni;
	}

	public Posicion getPosFin() {
		return posFin;
	}

	public void setPosFin(Posicion posFin) {
		this.posFin = posFin;
	}

//	METODOS

	public boolean esVertical() {
		if (posIni.getLaFila() == posFin.getLaFila())
			return true;
		return false;
	}

	public boolean eshorizontal() {
		if (posIni.getLaColumna() == posFin.getLaColumna())
			return true;
		return false;
	}

	public int saltoVertical() {
		int saltoVertical=0;
		if (esVertical() && posIni.getLaFila() != posFin.getLaFila())
			saltoVertical = posFin.getLaFila() + 1;
		return saltoVertical;
	}

	public int saltoHorizontal() {
		int saltoHorizontal=0;
		if (eshorizontal() && posIni.getLaColumna() != posFin.getLaColumna())
			saltoHorizontal = posFin.getLaColumna() + 1;
		return saltoHorizontal;
	}

	public int deltaFila() {
		
		return 0;

	}

	public int deltaColumna() {
		return 0;

	}

}
