import java.util.Scanner;
public class T01Ex01For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/*
		int a, b;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("Introduce el n�mero menor: ");
		a = s.nextInt();
		
		System.out.print("Introduce el n�mero mayor: ");
		b = s.nextInt();
		
		for ( int i = a ; i < b; i ++){
			System.out.print( i + " ");
		}
		System.out.println("Fin for.");
		
		*/
		//////////////////////////////////////////////////////////////////
		// Sumar todos los n�meros que hay entre dos n�meros introducidos.
		int a, b, suma=0;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("Introduce el n�mero menor: ");
		a = s.nextInt();
		
		System.out.print("Introduce el n�mero mayor: ");
		b = s.nextInt();
		
		for ( int i = a ; i < b; i ++){
			suma += i;
			System.out.print( i + "+ ");
		}
		System.out.println("Fin for." + " Resultado: " + suma);
	}

}
