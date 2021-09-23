
public class Main {

	public static void main(String []args) {
		ejercicio1("HolaoOo",'o');
		
		
	}
	
	static void ejercicio1(String frase, Character letra) {
		
		frase=frase.replace(Character.toString(letra), "");
		frase=frase.replace(Character.toString(letra).toUpperCase(), "");
		frase=frase.replace(Character.toString(letra).toLowerCase(), "");
		
		
		/*for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==letra) {
				
			}
		}*/
		
		System.out.println(frase);
		
		
	}
	
	
}
