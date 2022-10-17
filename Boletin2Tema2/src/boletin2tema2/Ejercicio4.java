package boletin2tema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos la variable en la que guardaremos el valor del resultado de la tirada de dados después de pasarlo a número.
		int numero;
		//Creamos la variable donde guardaremos el valor de la tirada del dado escrito
		String dado;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el primer mensaje y guardamos lo que se introduzca en la variable designada
		System.out.print("Introduzca el valor de la primera tirada (escrito) : ");
		dado = sc.next();
		//Creamos un switch en el que el valor numérico sacado a partir del valor escrito se guardará automáticamente en la variable 'numero'
		numero = switch (dado) {
		//En el caso de que el dado haya salido 'uno', numero = 1
			case "UNO", "uno" ->{
				yield 1;
			}
			//En el caso de que el dado haya salido 'dos', numero = 2
			case "DOS", "dos" ->{
				yield 2;
			}//En el caso de que el dado haya salido 'tres', numero = 3
			case "TRES", "tres" ->{
				yield 3;
			}
			//En el caso de que el dado haya salido 'cuatro', numero = 4
			case "CUATRO", "cuatro" ->{
				yield 4;
			}
			//En el caso de que el dado haya salido 'cinco', numero = 5
			case "CINCO", "cinco" ->{
				yield 5;
			}
			//En el caso de que el dado haya salido 'seis', numero = 6
			case "SEIS", "seis" ->{
				yield 6;
			}
			//En el caso de que ninguno de los posibles resultados haya sido introducido, se imprime un mensaje de error
			default -> {
				System.out.println("Error, el número introducido es incorrecto.\n");
				//el valor de numero  = -7;
				yield -7;
			}
		};
		//Imprimimos el segundo mensaje esperando a que se introduzca el valor de la segunda tirada y guardamos el valor en la misma variable que antes
		System.out.print("Introduzca el valor de la segunda tirada (escrito) : ");
		dado = sc.next();
		//El valor de 'numero' será igual al valor de la anterior tirada + el valor que le vamos a asignar ahora
		numero += switch (dado) {
			case "UNO", "uno" ->{
				//Asignamos 1
				yield 1;
			}
			//Asignamos 2
			case "DOS", "dos" ->{
				yield 2;
			}
			//Asignamos 3
			case "TRES", "tres" ->{
				yield 3;
			}
			//Asignamos 4
			case "CUATRO", "cuatro" ->{
				yield 4;
			}
			//Asignamos 5
			case "CINCO", "cinco" ->{
				yield 5;
			}
			//Asignamos 6
			case "SEIS", "seis" ->{
				yield 6;
			}
			//En el caso de que ninguno de los posibles resultados haya sido introducido, se imprime un mensaje de error
			default -> {
				System.out.println("Error, el valor introducido es incorrecto.\n");
				yield -7;
			}
		};
		
		//Se comprueba que el valor de 'numero' sea mayor que 0, si es así, se imprime el mensaje final con el valor resultante
		if (numero > 0) {
		System.out.print("La suma de las dos tiradas resulta: " + numero);
		}
		//Si no es así, se imprime un mensaje de error
		else {
			System.out.print("Uno de los dos números es incorrecto. Inténtelo de nuevo");
		}
		sc.close();
	}

}
