import java.util.Scanner;
public class Atributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);  //crear un objeto Scanner
        
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


   


