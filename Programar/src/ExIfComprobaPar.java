import java.util.Scanner;
public class ExIfComprobaPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, aux;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Comparador de números pares.");
		System.out.println("----------------------------");
		System.out.print("Introduce el número a comprobar: ");
		numero = s.nextInt();
		aux = numero % 2; 
		
		// Condiciones: "=="; "<"; "<="; ">"; ">="; "!=" 
		if ( aux == 0 ){
			System.out.println("El número: " + numero + " es par.");
		}
		else{
			System.out.println("El número " + numero + " no es par.");
		}
	}
}
