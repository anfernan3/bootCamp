package main;

public class Movimiento extends Posicion {

	private Posicion posIni;
	private Posicion posFin;
	
	
	
	public Movimiento() {
		super(0, 0);
		
	}

	
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
	
	public boolean esVertical() {
		return false;
	}
	public boolean eshorizontal() {
		return false;
	}
	public int saltoVertical() {
		return 0;
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
