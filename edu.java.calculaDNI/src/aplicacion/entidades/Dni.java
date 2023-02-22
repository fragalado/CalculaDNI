package aplicacion.entidades;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author csi22
 *
 */
public class Dni {
	
	// Atributos
	
	private int numeroDNI;
	private char letraDNI;
	
	// Constructores
	// Usaremos el constructor vacío
	
	
	// Getter y Setter
	
	public int getNumeroDNI() {
		return numeroDNI;
	}
	public void setNumeroDNI(int numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	public char getLetraDNI() {
		return letraDNI;
	}
	public void setLetraDNI(char letraDNI) {
		this.letraDNI = letraDNI;
	}
	
	// Métodos
	
	/**
	 * Calcula la letra del DNI, utilizando una array con las letras
	 * @param numDNI
	 * @return letra del DNI
	 */
	public char calculaLetra(int numDNI) {
		// Array con las letras
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		
		// Vamos a devolver la letra, luego:
		return letras[numDNI % 23];
	}
	
	/**
	 * Comprueba que el numero del DNI introducido sea correcto
	 * @param numDNI
	 * @return
	 */
	public int compruebaNumeroDNI(int numDNI) {
		// Scanner para leer
		Scanner entrada = new Scanner(System.in);
		
		// Comprobamos que el numero del DNI está bien introducido, es decir...
		// Es mayor que 0 y menor que 99999999
		while(numDNI < 0 || numDNI > 99999999) {
			// Mostramos mensaje de error al usuario
			System.err.println("** Error: El número de DNI introducido no cumple los requisitos **");
		
			// Volvemos a pedir el número
			System.out.print("\nIntroduzca el número del DNI: ");
			numDNI = entrada.nextInt();
		}
		return numDNI;
	}
	
	/**
	 * Comprueba que la letra del DNI introducido sea correcta
	 * @param letraUsu
	 * @param letraProgram
	 * @return
	 */
	public char compruebaLetraDNI(char letraUsu, char letraProgram) {
		// Scanner para leer
		Scanner valores = new Scanner(System.in);
		
		// Si no coinciden mostraremos mensaje de error y volveremos a pedir la letra
		while(letraProgram != letraUsu) {
			// Mensaje de error
			System.err.println("\n** Error: La letra que ha indicado no es correcta");
			
			// Pedimos la letra
			System.out.print("\nIntroduzca la letra del DNI: ");
			letraUsu = valores.next().toUpperCase().charAt(0);
		}
		return letraUsu;
	}
	
	/**
	 * Metodo para mostrar cada objeto de tipo dni de la base de datos
	 * @param listaBD
	 */
	public void mostrarListaDni(List<Dni> listaBD) {
		
		for (Dni aux : listaBD) {
			
			System.out.println(aux.toString());
		}
	}
	
	/**
	 * Crea un objeto de tipo DNI 
	 * @param numDNI
	 * @param letraDni
	 * @return Devuelve el objeto creado de tipo DNI
	 */
	public Dni creaObjetoDni(int numDNI, char letraDni) {
		
		// Inicializamos el objeto de tipo Dni
		Dni aux = new Dni();
		
		aux.setNumeroDNI(numDNI);
		aux.setLetraDNI(letraDni);
		
		return aux;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "DNI [numeroDNI=" + numeroDNI + ", letraDNI=" + letraDNI + "]";
	}
}
