package ej2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Introducimos los datos
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
 
        String texto = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(texto);
 
        texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);
 
        texto = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(texto);
 
        texto = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(texto);
		
      //Creamos objetos con cada constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
		
      //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        System.out.println(persona3.toString());

	}

}
