package boletin2tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos la variable en la que guardaremos los datos que el usuario introduzca por teclado.
		int num;
		//Creamos la variable en la que guardaremos el dato final que saldrá por consola.
		String dia;
		
		//Creamos el escáner.
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial, pidiéndole al usuario un valor numérico, que guardamos en la variable previamente creada para ello. 
		System.out.print("Introduzca un número equivalente a un día de la semana: ");
		num = sc.nextInt();
		
		//Creamos un switch con el valor introducido en pantalla, cuyos resultados guardaremos automáticamente en la variable "dia".
		dia = switch(num) {
		//En el caso de que el valor introducido sea 1, "dia" valdrá "lunes".
			case 1 -> {
				yield "lunes";
			}
			//En el caso de que el valor introducido sea 2, "dia" valdrá "martes".
			case 2 -> {
				yield "martes";
			}
			//En el caso de que el valor introducido sea 3, "dia" valdrá "miércoles".
			case 3 -> {
				yield "miércoles";
			}
			//En el caso de que el valor introducido sea 4, "dia" valdrá "jueves".
			case 4 -> {
				yield "jueves";
			}
			//En el caso de que el valor introducido sea 5, "dia" valdrá "viernes".
			case 5 -> {
				yield "viernes";
			}
			//En el caso de que el valor introducido sea 6, "dia" valdrá "sábado".
			case 6 -> {
				yield "sábado";
			}
			//En el caso de que el valor introducido sea 7, "dia" valdrá "domingo".
			case 7 -> {
				yield "domingo";
			}
			default -> {
				//En el caso de que el valor introducido no coincida con ninguna de las opciones, imprimimos el mensaje por defecto, diciendo que el valor es incorrecto.
				System.out.println("Número introducido incorrecto.");
				yield null;
			}
		}; //Muy importante añadir este ";", ya que sin él el programa no funcionaría
		
		//Imprimimos el mensaje final.
	System.out.println("El día de la semana es " + dia);
	
	//Cerramos el escáner.
	sc.close();
	}

}
