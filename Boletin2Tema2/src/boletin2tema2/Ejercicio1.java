package boletin2tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos la variable en la que guardaremos la nota que el usuario introduzca por pantalla.
		int nota;
		
		//Creamos el escáner del programa para poder leer lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial por pantalla, esperamos a que se introduzcan los datos y los guardamos en la variable designada.
		System.out.print("Introduzca una nota: ");
		nota = sc.nextInt();
		
		//Usamos un switch para imprimir diferentes resultados en función de los datos introducidos en la variable "nota".
		switch(nota) {
		//En el caso de que el valor vaya del 0 al 4, imprimimos "insuficiente".
		case 0,1,2,3,4 : System.out.print("INSUFICIENTE");
		break;
		//En el caso de que el valor sea 5, imprimimos "suficiente".
		case 5 : System.out.println("SUFICIENTE");
		break;
		//En el caso de que el valor sea 6, imprimimos "bien".
		case 6 : System.out.println("BIEN");
		break;
		//En el caso de que el valor sea 7 u 8, imprimimos "notable".
		case 7, 8 : System.out.println("NOTABLE");
		break;
		//En el caso de que el valor sea 9 o 10, imprimimos "sobresaliente".
		case 9, 10 : System.out.println("SOBRESALIENTE");
		break;
		//En el caso de que el valor introducido no coincida con ninguna de las opciones, imprimimos el mensaje por defecto, diciendo que el valor es incorrecto.
		default : System.out.println("Nota incorrecta");
		}
		
		//Cerramos el escáner.
		sc.close();
	}

}
