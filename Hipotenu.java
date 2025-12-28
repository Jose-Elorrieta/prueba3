package evaluacion1;

import java.util.Scanner;

public class Hipotenu {

	public static double pedirNumero (String mensaje, Scanner teclado) {
		System.out.print(mensaje);
		double numero = teclado.nextDouble();
		return numero;
	}
	
	public static double calcHipotenusa (double cateto1, double cateto2) {
		double hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		return hipo;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double cateto1 = pedirNumero ("Introduzca el primer cateto: ", teclado);
		double cateto2 = pedirNumero ("Introduzca el segundo cateto: ", teclado);
		double hipotenusa = calcHipotenusa (cateto1, cateto2);
		System.out.printf ("La hipotenusa del triángulo mide %.2f", hipotenusa);
		teclado.close();
	}

}
