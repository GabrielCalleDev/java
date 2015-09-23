import java.util.Scanner;

public class T01exDoWhileMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
	
		do{
			System.out.println("1. Enseñar por pantalla: 'Hola mundo'.");
			System.out.println("2. Enseñar por pantalla los números entre 5 y 10.");
			System.out.print("Introduce una opción: ");
			a = s.nextInt();
		}while( a > 2 || a < 1 );
		
		switch ( a ){
		case 1:
			System.out.println("Hola mundo.");
			break;
		case 2:
			for ( int i = 5; i < 10; i++){
				System.out.print( i + " ");
			}
			break;
		default:
			System.out.println("Este valor: " + a + " es desconocido.");
		}
	}
}
