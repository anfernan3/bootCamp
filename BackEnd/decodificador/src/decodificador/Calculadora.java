package decodificador;

public class Calculadora {

	private double total=0.0;
	private char pendiente = '+';
	
	public double calculo(double operando, char operador) {
		switch (operador) {
		case '+':
			total = total + operador;
			break;
		case '-':
			total = total - operador;
			break;
		case '*':
			total = total * operador;
		case '/':
			total = total / operador;
			break;
		case '%':
			total = total % operador;
			break;
		default:
			System.out.println("error");
		}
		return total;
	}
	
}
