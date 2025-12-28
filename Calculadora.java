package evaluacion1;

import java.util.Scanner;

// Rama en main con este comentario

public class Calculadora {
	
	public static int menu(Scanner teclado) {
		int opcion;
		System.out.println ("MENÚ CALCULADORA");
		System.out.println ("1.-Sumar");
		System.out.println ("2.-Restar");
		System.out.println ("3.-Multiplicar");
		System.out.println ("4.-Dividir");
		System.out.println ("5.-Salir");
		do{
			System.out.print ("Introduce la opción +deseada: ");
			opcion = teclado.nextInt();
			if (opcion < 1 || opcion > 5) {
			  System.out.println ("La opción debe ser un número entre 1 y 5.");
			}
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}
	

	public static int pideNumero(Scanner teclado) {
		int num; 
		System.out.print ("Introduce un número: ");
		num = teclado.nextInt();
		return num;
	}
	
	public static int suma (Scanner teclado) {
		int num1 = pideNumero(teclado);
		int num2 = pideNumero(teclado); 
		return num1 + num2;
	}
	
	public static int resta (Scanner teclado) {
		int num1 = pideNumero(teclado);
		int num2 = pideNumero(teclado); 
		return num1 - num2;
	}
	
	public static int multiplicacion (Scanner teclado) {
		int num1 = pideNumero(teclado);
		int num2 = pideNumero(teclado); 
		return num1 * num2;
	}
	
	public static int division (Scanner teclado) {
		int num1 = pideNumero(teclado);
		int num2 = pideNumero(teclado); 
		if (num2 == 0) {
			return -1;
		}
		else {
			return num1 / num2;
		}
	}
	
	public static void main(String[] args) {
		int opcion, resultado;
		Scanner teclado = new Scanner (System.in);
		do {
			opcion = menu(teclado);
			switch (opcion) {
			case 1: 
			  resultado = suma(teclado);
			  System.out.println ("El resultado de la suma es " + resultado);
			  break;
			case 2: 
			  resultado = resta(teclado);
			  System.out.println ("El resultado de la resta es " + resultado);
			  break;
			case 3: 
			  resultado = multiplicacion(teclado);   
		 	  System.out.println ("El resultado de la multiplicación es " + resultado);
			break;
			case 4: 
				resultado = division(teclado);
				if (resultado == -1) {
					System.out.println ("No se puede dividir entre 0");
				}
				else {
					System.out.println ("El resultado de la división es " + resultado);
				}
			}
			System.out.println();
		} while (opcion != 5);
		teclado.close();
	}

}
