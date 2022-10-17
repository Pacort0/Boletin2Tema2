package boletin2tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos las variables donde guardaremos los valores que el usuario introduzca por teclado.
		int num1;
		int num2;
		String letra;
		//Creamos la variable en la que guardaremos el resultado de la operación que el usuario solicite
		int resultado;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el primer mensaje y esperamos a que el usuario introduzca los datos, guardándolos en la variable designada
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextInt();
		//Repetimos el proceso anterior para el siguiente número.
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		//A continuación, mostramos por pantalla el menú de opciones de operaciones al usuario y guardamos la opción que elija en la variable designada
		System.out.println("\nA. SUMAR LOS NÚMEROS."
				+ "\nB. RESTAR LOS NÚMEROS."
				+ "\nC. MULTIPLICAR LOS NÚMEROS."
				+ "\nD. DIVIDIR LOS NÚMEROS."
				+ "\n\nPor favor, elija una opción: ");
		letra = sc.next();
		
		//Creamos un switch para asignar un resultado a cada opción que el usuario introduzca
		switch(letra){
		//En el caso de que el usuario introduzca la opción 'a', el resultado será la suma de num1 y num2
			case "a", "A": 
				resultado = num1 + num2;
				System.out.println("La suma de los dos números es igual a " + resultado);
				break;
				//En el caso de que el usuario introduzca la opción 'b', el resultado será la resta de num1 y num2
			case "b", "B":
				resultado = num1 - num2;
				System.out.println("La resta de los dos números es igual a " + resultado);
				break;
				//En el caso de que el usuario introduzca la opción 'c', el resultado será la multiplicación de num1 y num2
			case "c", "C":
				resultado = num1 * num2;
				System.out.println("La multiplicacion de los dos números es igual a " + resultado);
				break;
				//En el caso de que el usuario introduzca la opción 'd', el resultado será la multiplicación entre num1 y num2
			case "d", "D":
				resultado = num1 / num2;
				System.out.println("La division de los dos números es igual a " + resultado);
				break;
				//En el caso de que se introduzca una letra que no coincida con ninguna de las opciones, se imprime un mensaje de error
			default : 
				System.out.print("Letra introducida incorrecta, inténtelo de nuevo.");

		}
		//Cerramos el escáner
		sc.close();
	}

}
