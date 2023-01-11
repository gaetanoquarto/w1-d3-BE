package esercizio4;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.printf("Inserisci un numero: ");
		num = in.nextInt();
		
		for(int i = num; i >= 0; i--) {
			
			System.out.println(i);
		}
		System.out.println("Countdown terminato!");
	}

}
