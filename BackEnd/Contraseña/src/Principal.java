import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Introducimos el tama�o del array y la longitud del password
		String texto = JOptionPane.showInputDialog("Introduce un tama�o para el array");
		int tama�o = Integer.parseInt(texto);

		texto = JOptionPane.showInputDialog("Introduce la longitud del password");
		int longitud = Integer.parseInt(texto);

		// Creamos los arrays
		Contrase�a listaPassword[] = new Contrase�a[tama�o];
		boolean fortalezaPassword[] = new boolean[tama�o];

		// Creamos objetos, indicamos si es fuerte y mostramos la contrase�a y su
		// fortaleza.
		for (int i = 0; i < listaPassword.length; i++) {
			listaPassword[i] = new Contrase�a(longitud);
			fortalezaPassword[i] = listaPassword[i].esFuerte();
			System.out.println(listaPassword[i].getContrase�a() + " " + fortalezaPassword[i]);
		}
	}

}
