package decodificador;

public class Decodificador {

	public static void main(String[] args) {
		
		String cadena = "3+4+3,4-7*1=";
		String[] partes = cadena.split("(?<=[-+*=])");

		
		for (int i = 0; i < partes.length; i++) {
			System.out.println(partes[i]);
		}
		
	}

}
