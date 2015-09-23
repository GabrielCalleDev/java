import java.util.Scanner;
public class T41Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = new int[5];
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<5; i++){
			System.out.print("Intruduce un número al vector: ");
			vector[i] = s.nextInt();
		}
		
		for ( int i=0; i<5; i++){
			System.out.print( vector[i] + ", ");
		}
		
	}

}
