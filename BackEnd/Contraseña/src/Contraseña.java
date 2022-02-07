
public class Contrase�a {

//	ATRIBUTOS
	private int longitud;
	private String contrase�a;
	private final static int LONG_DEF = 8;

//	CONSTRUCTORES

	public Contrase�a() {
		this(LONG_DEF);
	}

	public Contrase�a(int longitud) {
		this.longitud=longitud;
		contrase�a = generarContrase�a();
	}

//	SETTER Y GETTER

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

//	METODOS
	private String generarContrase�a() {
		for (int i = 0; i < longitud; i++) {
			int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

			if (eleccion == 1) {
				char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				contrase�a += minusculas;
			} else {
				if (eleccion == 2) {
					char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					contrase�a += mayusculas;
				} else {
					char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					contrase�a += numeros;
				}
			}
		}
		return contrase�a;
	}

	public boolean esFuerte() {

		int cuentaNumeros = 0;
		int cuentaMinusculas = 0;
		int cuentaMayusculas = 0;

		for (int i = 0; i < contrase�a.length(); i++) {
			if (contrase�a.charAt(i) >= 97 && contrase�a.charAt(i) <= 122) {
				cuentaMinusculas += 1;
			} else {
				if (contrase�a.charAt(i) >= 65 && contrase�a.charAt(i) <= 90) {
					cuentaMayusculas += 1;
				} else {
					cuentaNumeros += 1;
				}
			}
		}
		if (cuentaNumeros >= 5 && cuentaMinusculas >= 1 && cuentaMayusculas >= 2) {
			return true;
		} else {
			return false;
		}

	}

}
