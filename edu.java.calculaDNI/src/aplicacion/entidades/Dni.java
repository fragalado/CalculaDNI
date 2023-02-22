package aplicacion.entidades;

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
	
	// toString
	
	@Override
	public String toString() {
		return "DNI [numeroDNI=" + numeroDNI + ", letraDNI=" + letraDNI + "]";
	}
}
