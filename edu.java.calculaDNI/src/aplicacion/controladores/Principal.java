package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Dni;

/**
 * Clase principal donde se ejecutarán las demás clases
 * @author csi22
 *
 */
public class Principal {

	public static void main(String[] args) {
		// lista
		List<Dni> listaBD = new ArrayList<>();
		
		// Inicializamos el objeto de tipo Dni
		Dni res = new Dni();
		
		// Vamos a almacenar en una variable el numero de DNI y en otra la letra
		// Pediremos los datos por consola
		int numDNIUsuario;
		char letraDNIUsuario;
		
		// Scanner para leer los datos
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		char letraDNI;
		do {
			// Mostramos el Menu
			Menu();
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				// Numero dni
				System.out.print("Introduzca el número del DNI: ");
				numDNIUsuario = sc.nextInt();
				
				// Letra dni
				System.out.print("Introduzca la letra del DNI: ");
				letraDNIUsuario = sc.next().toUpperCase().charAt(0);
				
				// Ahora comprobamos que el numero del DNI está bien introducido, es decir...
				// Es mayor que 0 y menor que 99999999
				numDNIUsuario = res.compruebaNumeroDNI(numDNIUsuario); // Si el numero está bien.
																			// nos devolverá el mismo numero
				
				// Una vez que tenemos un numero de DNI válido
				// Vamos a calcular la letra del numero pasado y después vamos a compararla con la letra
				// introducida por el usuario
				letraDNI = res.calculaLetra(numDNIUsuario);
				
				// Ahora comparamos las letras
				// Si no coinciden mostraremos mensaje de error y volveremos a pedir la letra
				letraDNIUsuario = res.compruebaLetraDNI(letraDNIUsuario, letraDNI);
				
				// Una vez que tenemos el numero y la letra correcta, mostraremos un mensaje indicando que es correcto
				System.out.println("El número y la letra de DNI son correctos");
				
				// Añadimos a la lista el objeto
				listaBD.add(res.creaObjetoDni(numDNIUsuario, letraDNI));
				
				break;
				case 2:
					res.mostrarListaDni(listaBD);
					break;
			}
			
			
		} while (opcion != 0);
		
		
		
		// Cerramos Scanner
		sc.close();
	}
	
	
	private static void Menu() {
		System.out.println("1. Introduce DNI");
		System.out.println("2. Muestra lista");
		System.out.println("0. Salir");
	}
}
