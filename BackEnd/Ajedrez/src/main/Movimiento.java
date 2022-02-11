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
//		mientras la fila inicial no sea igual a la final le sumas 1
		
		while(posIni.getLaFila() != posFin.getLaFila()) {
			int posicion=posIni.getLaFila();
			return posicion+1;
		}
		return -1;
		
	}

	public int deltaColumna() {
//		si no cambia la fila a la columna tienes que sumar 1
		while(posIni.getLaColumna() != posFin.getLaColumna()) {
			int posicion=posIni.getLaColumna();
			return posicion+1;
		}
		return -1;
	}

}
