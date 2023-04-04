/**
 * 
 */
package presnecial;
import java.util.Scanner;

import presnecial.metods;
/**
 * @author angel
 *
 */
class calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		/*declaro como entero la variable opcion*/
		
		int opcion;
		
	 /*aqui estoy creando el menu de forma visual*/
		
		do {
			System.out.println("Selecciona que operacion vas a hacer hoy :D --> ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir");
			
			opcion = leer.nextInt();	
			/*aqui le pedimos que le la variabe opcion*/
			
			/*aqui meto un si que lo que hace esque si el numero es mayor a 4 o menos a cero te muestre por
			 * pantalla algun error*/
				
				if (opcion > 5 || opcion < 0) {
					
					System.out.println("No es una opcion valida. Vuelve a escribir la opción que deseas realizar.");
					
					/*aqui meto otro if que obliga a que las inicas opciones viables por la anterior restriccion 
					 * sean 1,2,3,4  entonces hace el switch y dependiendo del numero que elijas llame a un metodo u
					  otro*/
				} else if (opcion != 0){
					
					switch(opcion) {
					case 1:metods.suma();
					break;
					case 2:metods.resta();
					break;
					case 3:metods.multiplicacion();
					break;
					case 4:metods.division();
					break;
					case 5:metods.resto();
					break;
					
					}
			   }
		  } 
			while (opcion != 0) ;
		
		/*aqui pongo que mientras que la opcion no sea 0 se siga ejecutando el bucle*/
		
		    leer.close();
	}

}
