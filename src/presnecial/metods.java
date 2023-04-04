/**
 * 
 */
package presnecial;

import java.util.Scanner;

/**
 * @author angel
 *
 */
public class metods {

	/**
	 * @param args
	 */
/*aqui declaro la clase leer */
		static Scanner leer = new Scanner(System.in);
		
/*aqui hago el metodo de la suma un metodo sencillo que suma 2 numeros introducidos por teclado */
		public static void suma(){
			System.out.println("introduce el primer numero");
			int a = leer.nextInt();
			System.out.println("introduce el segundo numero");
			int b = leer.nextInt();
			int rSuma=a+b;
			System.out.println("el resultado es: "+rSuma);
		}
/*aqui hago el metodo de la resta un metodo sencillo que resta 2 numeros introducidos por teclado */
		public static void resta(){
			System.out.println("introduce el primer numero");
			int a = leer.nextInt();
			System.out.println("introduce el segundo numero");
			int b = leer.nextInt();
			int rResta=a-b;
			System.out.println("el resultado es: "+rResta);
		}
		
		public static void multiplicacion(){
			System.out.println("introduce el primer numero");
			int a = leer.nextInt();
			System.out.println("introduce el segundo numero");
			int b = leer.nextInt();
/*lo que hacemos aqui es hacer una condicion que obligue a que b no sea 0,si lo es no 
  se realizara la operacion*/
			 if (b != 0) {
				 
/*aqui supongamos que a es -5 como es menos a 0 a pasaria a ser: --5, y menos por menos es mas asi se 
 pasaria a positivo*/
				 
	                if (a < 0) {
	                   a = -a;
	                }
/*aqui supongamos que b es -7 como es menos a 0 a pasaria a ser: --7, y menos por menos es mas asi se 
pasaria a positivo*/
	                if (b < 0) {
	                    b = -b;
	                }
	                int rMultiplicacion =  a * b;
	                System.out.println("El resultado de la Multiplicacion es: "+ rMultiplicacion);
			 }
		}
		
		public static void division(){
			System.out.print("\n\tIntroduzca el dividendo: ");
            int a = leer.nextInt();
            System.out.print("\tIntroduzca el divisor: ");
            int b = leer.nextInt();
/*lo que hacemos aqui es hacer una condicion que obligue a que b no sea 0,si lo es no 
            se realizara la operacion*/
          			 if (b != 0) {
          				 
/*aqui supongamos que a es -5 como es menos a 0 a pasaria a ser: --5, y menos por menos es mas asi se 
           pasaria a positivo*/
          				 
          	                if (a < 0) {
          	                   a = -a;
          	                }
/*aqui supongamos que b es -7 como es menos a 0 a pasaria a ser: --7, y menos por menos es mas asi se 
          pasaria a positivo*/
                if (b < 0) {
                    b = -b;
                }
                int rDivision =  a / b;
                System.out.println("El resultado de la division es: " + rDivision);
                
            }
			
			
				
		}
		
		public static void resto(){
			System.out.println("introduce el primer numero");
			int a = leer.nextInt();
			System.out.println("introduce el segundo numero");
			int b = leer.nextInt();
			int rResto=a%b;
			System.out.println("el resultado es: "+rResto);
		}
	}


