import java.util.Scanner;
public class Atributos {

	private static Scanner s;

	public static void main(String[] args) { 
		s = new Scanner(System.in);
        
        String palabra;
        int numero;
        
        System.out.print("Introduzca su nombre: ");       
        palabra = s.nextLine();  //leer un String palabra
        
        System.out.print("Introduzca un número: ");
        numero = s.nextInt(); //leer un entero
        
        //Imprimiendo resultados
        System.out.print("Hola " + palabra + "!!! ");
        System.out.println("El número que has intrucido es: " + numero);
	}

}


   


