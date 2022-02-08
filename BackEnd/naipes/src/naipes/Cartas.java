package naipes;

import java.util.ArrayList;
import java.util.HashMap;

public class Cartas {

	// ATRIBUTOS
	private int valor;
	private String palo;
	private String nombreCarta;

	// CONSTRUCTOR

	public Cartas(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
		nombreCarta = valor + " " + palo;
	}

//	GETTER Y SETTER

	public Cartas() {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setPalo(String palo) {
		this.palo = palo;
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

//	METODOS

	public String getRango() {

		switch (this.valor) {
		case 1:
			return "as";
		case 11:
			return "sota";
		case 12:
			return "reina";
		case 13:
			return "rey";
		default:
			return String.valueOf(valor);
		}
	}

	public boolean comparar(Cartas otra) {
		return this.palo.equals(otra.palo) && this.valor == otra.valor;
	}

	public static String getSerie(ArrayList<Cartas> mano) {
		int mayorPalo = 0;
		int mayorNum = 0;

		HashMap<Integer, Integer> numeros = new HashMap<Integer, Integer>();
		HashMap<String, Integer> palos = new HashMap<String, Integer>();

		for (Cartas c : mano) {
			int add = palos.get(c.palo) != null ? palos.get(c.palo) + 1 : 1;
			palos.put(c.palo, add);
			add = numeros.get(c.valor) != null ? numeros.get(c.valor) + 1 : 1;
			numeros.put(c.valor, add);
		}

		for (Integer e : palos.values()) {
			mayorPalo = e > mayorPalo ? e : mayorPalo;
		}

		for (Integer e : numeros.values()) {
			mayorNum = e > mayorNum ? e : mayorNum;
		}

		StringBuilder returnValor = new StringBuilder();

		if (mayorPalo == mano.size())
			return "flush";
		if (mayorNum == mano.size() - 1)
			return "poker";
		return "ninguna";

	}

	public static int getPuntosPoker(ArrayList<Cartas> mano) {
		int c = 0;
		boolean tieneAs = false;

		for (Cartas k : mano) {
			switch (k.valor) {
			case 1:
				c += 11;
				tieneAs = true;
				break;
			case 11:
			case 12:
			case 13:
				c += 10;
				break;
			default:
				c += k.valor;
			}

		}

		if (c >= 21 && tieneAs) {
			return c - 10;
		} else
			return c;
	}
}
