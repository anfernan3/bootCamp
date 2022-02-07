package naipes;

public class Carta {
	
	private int numero;
	private String palo;
	String nombreCarta;
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo=palo;
		nombreCarta = numero + " " + palo;
	}
	

}
