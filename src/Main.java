import java.util.Scanner;
public class Main {

	public static void main(String []args) {
		ejercicio1();
		
		
	}
	
	static void ejercicio1() {
		
		//Inicializar variables
		Scanner teclado = new Scanner(System.in);
		String frase="";
		String letra="";
		
		//Pide al usuario que escriba una frase
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		
		//Pide al usuario que escriba una letra
		System.out.println("Escribe una letra o frase para eliminarla");
		letra = teclado.nextLine();
		
		
		teclado.close();
		//reemplaza la letra con una cadena vacía (no un espacio)
		frase=frase.replace(letra, "");
		
		
		

		
		System.out.println(frase);
		
		
	}
	
	
}
