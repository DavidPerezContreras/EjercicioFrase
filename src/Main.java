

//Agarra el contenido del archivo Entrada.txt
//Pide una serie de letras para eliminarlas de la cadena
//Luego escibe el output en el archivo Salida.txt



import java.io.FileReader;
import java.io.IOException;
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

		try {
			FileReader input = new FileReader("src\\Entrada.txt");
			int c=input.read();
		
			frase+=(char)input.read();
			
			while(c!=-1) {
				frase+=(char)c;
				c=input.read();
				
			
			}
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(frase);
		
		//Pide al usuario que escriba una frase
		//System.out.println("Escribe una frase");
		//frase = teclado.nextLine();
		
		//Pide al usuario que escriba una cadena
		System.out.println("Escribe una letra o frase para eliminarla");
		letra = teclado.nextLine();
		
		
		//teclado.close();
		//reemplaza la letra con una cadena vacía (no un espacio)
		//frase=frase.replace(letra, "");
		
		
		

		
		System.out.println(frase);
		
		
	}
	
	
}
