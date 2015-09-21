
public class T01WhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b;
		
		while ( a < 6 ){
			System.out.print( a + " ");
			a += 1;
		}
		System.out.println("fin while.");
		
		for ( b = 1; b < 6; b += 1){
			System.out.print( b + " ");
		}
		System.out.println("Fin for.");
	}

}
