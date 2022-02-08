package naipes;

public abstract class Carta<T> {
	
	private int numero;
	private T palo;

	
	public Carta(int numero, T palo) {
		this.numero = numero;
		this.palo=palo;
	}
	

}
