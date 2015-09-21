
import java.util.Scanner;
public class intercambioAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce valor de A: ");
		a = s.nextInt();
		
		System.out.print("Introduce valor de B: ");
		b = s.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("El valor de A es: " + a + " y el valor de B es: " + b);
	}

}
