import java.util.Scanner;
public class condicionesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, comparar;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce el comparador: ");
		comparar = s.nextInt();
		System.out.print("Introduce el número a comparar: ");
		numero = s.nextInt();
		
		/*
		 * Condiciones: "=="; "<"; "<="; ">"; ">="; "!="
		 * 
		if ( condicion1 ){
			instrucciones
		}
		else if ( condicion2 ){
			instrucciones
		}
		else{
			instrucciones
		}
		*/
				 
		if ( numero == comparar ){
			System.out.println("Los números introducidos son iguales: " + comparar + " .");
		}
		else{
			System.out.println("El número no es " + comparar + ". El número es: " + numero );
		}
	}
}
