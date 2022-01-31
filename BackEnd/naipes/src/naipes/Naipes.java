package naipes;

public class Naipes {
	
	//ATRIBUTOS
	private int valor;
	private String palo;
	
	//CONSTANTES
	public static final String[] PALOS= {"ORO", "COPAS", "ESPADAS", "BASTOS"};
	public static final int LIMITE_CARTA_PALO=12;
	
	//CONSTRUCTOR
	
	public Naipes(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "valor=" + valor + ", palo=" + palo;
	}
	
	

	

}
