package esercizio3;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
	

		String stringa;

		do{
			Scanner in = new Scanner(System.in);
			System.out.printf("%nInserisci una parola: ");
			stringa = in.nextLine();
				for(int i = 0; i < stringa.length(); i++) {
					System.out.printf(stringa.charAt(i) + ",");
				}
			 
	        } while(!stringa.equals(":q"));
			
			
		}

	}

