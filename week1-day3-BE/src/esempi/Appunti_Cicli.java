package esempi;

public class Appunti_Cicli {

	public static void main(String[] args) {
		
		albero:
		for (int i = 1; i <= 5; i++) {
			if (i == 3) continue;
			
			for (int j = 1; j <= 5; j++) {
				if(j == 2) break albero;
				System.out.print(j + " ");
			}
			System.out.println(i);
		}
	}

}