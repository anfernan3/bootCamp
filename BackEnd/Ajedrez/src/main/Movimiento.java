package main;

public class Movimiento {

	private Posicion posIni[][];
	private Posicion posFin[][];

	public Movimiento(String movimiento) {
		this.posIni = posIni;
		this.posFin = posFin;
	}

	public Posicion[][] getPosIni() {
		return posIni;
	}

	public void setPosIni(Posicion[][] posIni) {
		this.posIni = posIni;
	}

	public Posicion[][] getPosFin() {
		return posFin;
	}

	public void setPosFin(Posicion[][] posFin) {
		this.posFin = posFin;
	}

	public boolean esVertical() {
		
		return false;
	}

	public boolean eshorizontal() {
		if (f1 == f2)
			return true;
		return false;
	}

	public int saltoVertical() {
		int saltoVertical=Posicion.class.get)-Posicion.getLaFila();
		return saltoVertical;
	}

	public int saltoHorizontal() {
		return 0;
	}

	public int deltaFila() {
		return 0;

	}

	public int deltaColumna() {
		return 0;

	}

}
