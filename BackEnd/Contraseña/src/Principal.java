import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Introducimos el tamaño del array y la longitud del password
		String texto = JOptionPane.showInputDialog("Introduce un tamaño para el array");
		int tamaño = Integer.parseInt(texto);

		texto = JOptionPane.showInputDialog("Introduce la longitud del password");
		int longitud = Integer.parseInt(texto);

		// Creamos los arrays
		Contraseña listaPassword[] = new Contraseña[tamaño];
		boolean fortalezaPassword[] = new boolean[tamaño];

		// Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su
		// fortaleza.
		for (int i = 0; i < listaPassword.length; i++) {
			listaPassword[i] = new Contraseña(longitud);
			fortalezaPassword[i] = listaPassword[i].esFuerte();
			System.out.println(listaPassword[i].getContraseña() + " " + fortalezaPassword[i]);
		}
	}

}
