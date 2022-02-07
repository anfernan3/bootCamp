
public class Contraseña {

//	ATRIBUTOS
	private int longitud;
	private String contraseña;
	private final static int LONG_DEF = 8;

//	CONSTRUCTORES

	public Contraseña() {
		this(LONG_DEF);
	}

	public Contraseña(int longitud) {
		this.longitud=longitud;
		contraseña = generarContraseña();
	}

//	SETTER Y GETTER

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

//	METODOS
	private String generarContraseña() {
		for (int i = 0; i < longitud; i++) {
			int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

			if (eleccion == 1) {
				char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				contraseña += minusculas;
			} else {
				if (eleccion == 2) {
					char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					contraseña += mayusculas;
				} else {
					char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					contraseña += numeros;
				}
			}
		}
		return contraseña;
	}

	public boolean esFuerte() {

		int cuentaNumeros = 0;
		int cuentaMinusculas = 0;
		int cuentaMayusculas = 0;

		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
				cuentaMinusculas += 1;
			} else {
				if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
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
