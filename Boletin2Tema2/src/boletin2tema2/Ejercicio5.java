package boletin2tema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos la variable en la que guardaremos el valor que el usuario introduzca
		String carnet;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos el mensaje principal y guardamos el valor introducido en la variable asignada
		System.out.print("Introduzca la letra de su carnet de conducir : ");
		carnet = sc.next();
		
		//Creamos un switch para cada posible opción que el usuario introduzca por teclado
		switch (carnet) {
		//En el caso de que se introduzca 'a', imprimimos el mensaje correspondiente
			case "A", "a": System.out.println("Su permiso de conducir le permite conducir motocicletas.");
			break;
			//En el caso de que se introduzca 'b', imprimimos el mensaje correspondiente
			case "B1", "B2", "b1", "b2": System.out.println("Su permiso de conducir le permite conducir automóviles.");
			break;
			//En el caso de que se introduzca 'c', imprimimos el mensaje correspondiente
			case "C1", "C5", "c1", "c5": System.out.println("Su permiso de conducir le permite conducir camiones.");
			break;
			//En el caso de que se introduzca 'd', imprimimos el mensaje correspondiente
			case "D", "d": System.out.println("Su permiso de conducir le permite conducir autobuses.");
			break;
			//En el caso de que se introduzca 'e', imprimimos el mensaje correspondiente
			case "E", "e": System.out.println("Su permiso de conducir le permite conducir remolques.");
			break;
			//En el caso de que el valor introducido no sea ninguno de los contemplados, se imprime un mensaje de error
			default: System.out.print("Categoría no contemplada.");
		}
		//Cerramos el escáner
		sc.close();
	}

}
