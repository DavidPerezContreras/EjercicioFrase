

//Agarra el contenido del archivo Entrada.txt
//Pide una serie de letras para eliminarlas de la cadena
//Luego escibe el output en el archivo Salida.txt
//Lee el contenido de un archivo,  pregunta una cadena, y escribe el contenido en un archivo de salida quitando los carácteres que aparecen en esa cadena


import java.io.FileReader;
import java.io.FileWriter;
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
		String letras;
		int c;
		Character [] letrasParaEliminar;
		
		
		
		//ENTRADA
		try {
			FileReader input = new FileReader("src\\Entrada.txt");
			c=input.read();
		
			//frase+=(char)input.read();
			
			while(c!=-1) {
				frase+=(char)c;
				c=input.read();
				
			
			}
		input.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Imprime la frase de ENTRADA
		System.out.println(frase);
		
		
		
		
		
		

		
		//Pide al usuario que escriba una cadena
		System.out.println("Escribe una letra o frase para eliminarla");
		letras = teclado.nextLine();
		teclado.close();
		
		//Rellena el Array de carácteres con las letras de la frase
		letrasParaEliminar = new Character[letras.length()];
		for (int i=0;i<letras.length();i++) {
			letrasParaEliminar[i]=letras.charAt(i);
		}
		
		
		for(Character i:letrasParaEliminar) {
			frase=frase.replace(Character.toString(i), "");
			System.out.println(i);
		}
		
		
		
		
		//La muestra por pantalla, pero quiero que lo escriba en un archivo
		System.out.println(frase);
		
		
		try {
			FileWriter output = new FileWriter("src\\Salida.txt");
			
			output.write(frase);
			
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
