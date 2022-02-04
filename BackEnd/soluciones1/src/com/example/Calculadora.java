package com.example;

import java.util.List;

import com.example.CalculadoraException;

public class Calculadora {

    public static final String OPERACIONES_SOPORTADAS = "+-*/=%";
    
    private double acumulado;
    private char operadorPendiente;

    /**
     * Constructor por defecto
     */
    public Calculadora() {
        inicializa();
    }

    /**
     * Restaura el valor inicial para calcular la siguiente secuencia
     */
    public void inicializa() {
        acumulado = 0;
        operadorPendiente = '+';
    }

    public double getAcumulado() {
        return acumulado;
    }


    public boolean isOperacion(char operacion) {
        return OPERACIONES_SOPORTADAS.indexOf(operacion) != -1;
    }

    public double calcula(double operando2, char nuevoOperador) throws CalculadoraException{
        if (!isOperacion(nuevoOperador)) {
            throw new CalculadoraException("Operación no soportada.");
        }
        switch (operadorPendiente) {
            case '+':
                acumulado += operando2;
                break;
            case '-':
                acumulado -= operando2;
                break;
            case '*':
                acumulado *= operando2;
                break;
            case '/':
                acumulado /= operando2;
                break;
            case '%':
                acumulado %= operando2;
                break;
            case '=':
                acumulado += operando2;
                break;
            default:
                throw new CalculadoraException("Operación no soportada.");
        }
        this.operadorPendiente = nuevoOperador;
        return acumulado;
    }


    public double calcula(String operando2, char nuevoOperador) throws CalculadoraException {
        if (operando2.endsWith(",") || operando2.endsWith(".")) {
            operando2 += "0";
        }
        try {
            return calcula(
                    Double.parseDouble(operando2.replace(',', '.')),
                    nuevoOperador);
        } catch (NumberFormatException ex) {
            throw new CalculadoraException(
                    "El operando no tienen un formato númerico valido.", 
                    ex);
        }
    }
    
	public static class Operacion {
		private double operando;
		private char operador;
		
		public Operacion(double operando, char operador) {
			super();
			this.operando = operando;
			this.operador = operador;
		}
		public Operacion(String operando, char operador) {
			this(Double.parseDouble(operando.replace(',', '.')), operador);
		}
		public double getOperando() {
			return operando;
		}
		public char getOperador() {
			return operador;
		}
	}
	
	public double calcula(List<Operacion> operaciones) throws CalculadoraException {
		inicializa();
		for (Operacion operacion : operaciones) {
			calcula(operacion.getOperando(), operacion.getOperador());			
		}
		return acumulado;
	}
	
}
