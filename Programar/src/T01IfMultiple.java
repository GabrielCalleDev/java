import java.util.Scanner;
public class T01IfMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numero;
		
		System.out.print("Introduce un número: ");
		numero = s.nextInt();
		
		// Condiciones multiples: && = Y; || = Ó
		if ( numero > 0 && numero < 10 ){
			System.out.println("El número: " + numero + " es menor a 10.");
		}
		else{
			System.out.println("El número: " + numero + " es mayor a 10.");
		}
	}
}