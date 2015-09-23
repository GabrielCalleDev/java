import java.util.Scanner;

public class T01DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("Introduce un número menor: ");
		a = s.nextInt();
		
		do{
			System.out.print("Introduce un número mayor que el anterior: ");
			b = s.nextInt();
		}while( b < a );
		
		System.out.println("Fin del programa.");
	}

}
