package esercizio1;

public class Esercizio1 {

	public static void main(String[] args) {
		
		System.out.println(stringaPariDispari("Ciao"));
		System.out.println(annoBisestile(2004));


	}
	
	public static boolean stringaPariDispari(String stringa) {
		if(stringa.length() %2 == 0) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {

			if (anno % 100 == 0) {

				if (anno % 400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}
}

