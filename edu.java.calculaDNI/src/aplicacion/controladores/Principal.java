package aplicacion.controladores;

import java.util.Scanner;

import aplicacion.entidades.Dni;

/**
 * Clase principal donde se ejecutarán las demás clases
 * @author csi22
 *
 */
public class Principal {

	public static void main(String[] args) {
		// 
		// Inicializamos el objeto de tipo Dni
		Dni res = new Dni();
		
		// Vamos a almacenar en una variable el numero de DNI y en otra la letra
		// Pediremos los datos por consola
		int numDNIUsuario;
		char letraDNIUsuario;
		
		// Scanner para leer los datos
		Scanner sc = new Scanner(System.in);
		
		// Numero dni
		System.out.print("Introduzca el número del DNI: ");
		numDNIUsuario = sc.nextInt();
		
		// Letra dni
		System.out.print("Introduzca la letra del DNI: ");
		letraDNIUsuario = sc.next().toUpperCase().charAt(0);
		
		// Ahora comprobamos que el numero del DNI está bien introducido, es decir...
		// Es mayor que 0 y menor que 99999999
		while(numDNIUsuario < 0 || numDNIUsuario > 99999999) {
			// Mostramos mensaje de error al usuario
			System.err.println("** Error: El número de DNI introducido no cumple los requisitos **");
		
			// Volvemos a pedir el número
			System.out.print("\nIntroduzca el número del DNI: ");
			numDNIUsuario = sc.nextInt();
		}
		
		// Una vez que tenemos un numero de DNI válido
		// Vamos a calcular la letra del numero pasado y después vamos a compararla con la letra
		// introducida por el usuario
		char letraDNI = res.calculaLetra(numDNIUsuario);
		
		// Ahora comparamos las letras
		// Si no coinciden mostraremos mensaje de error y volveremos a pedir la letra
		while(letraDNI != letraDNIUsuario) {
			// Mensaje de error
			System.err.println("\n** Error: La letra que ha indicado no es correcta");
			
			// Pedimos la letra
			System.out.print("\nIntroduzca la letra del DNI: ");
			letraDNIUsuario = sc.next().toUpperCase().charAt(0);
		}
		
		// Una vez que tenemos el numero y la letra correcta, mostraremos un mensaje indicando que es correcto
		System.out.println("El número y la letra de DNI son correctos");
		
		// Cerramos Scanner
		sc.close();
		
		// Añadimos el numero y la letra al objeto creado
		res.setNumeroDNI(numDNIUsuario);
		res.setLetraDNI(letraDNI);
		
		// Mostramos el objeto por pantalla
		System.out.println(res.toString());
	}

}
