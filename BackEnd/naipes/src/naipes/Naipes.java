package naipes;

public class Naipes {
	
	//ATRIBUTOS
	protected int valor;
	protected String palo;
	protected String nombreCarta;
	
	//CONSTRUCTOR
	
	public Naipes(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
		nombreCarta = valor + " " + palo;
	}
	
//	GETTER Y SETTER

	public Naipes() {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}


	public String getPalo() {
		return palo;
	}


	public String getNombreCarta() {
		return nombreCarta;
	}

	
//	TO STRING
	
	@Override
	public String toString() {
		return "valor=" + valor + ", palo=" + palo;
	}

	

}
