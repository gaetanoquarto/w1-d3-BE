package school.objects;

public class Main {
	
	static Student[] students;

	public static void main(String[] args) {

			students = new Student[] {
				new Student("Gaetano", "Quarto", new double[] {7,10,8}, 'm' ),
				new Student("Pasquale", "Capuano", new double[] {8,6,9}, 'm' ),
				new Student("Luca", "Lattanzi", new double[] {6,6,7}, 'm' ),
				new Student("Alessia", "Lacitignola", new double[] {8,7,8}, 'f' ),
				new Student("Flavio", "Cirillo", new double[] {6,6,7}, 'm' )
		};
		
		printBest();
		printBestGender('m');
		printBestGender('f');
	}
	
	static void printBest() {
		Student best = students[0];
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAvgVote() > best.getAvgVote()) {
				best = students[i];
			}		
		}
		System.out.println("Lo studente migliore è: " + best.getFullName());	
	}
	
	static void printBestGender(char gender) {
		Student best = new Student("", "", new double[] { 0 }, gender);
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAvgVote() > best.getAvgVote() && students[i].genere == gender) {
				best = students[i];
			}		
	}
		
		String message = "";
		
		switch (best.genere) {
		case 'm':
			message += "lo studente ";
			break;
		case 'f':
			message += "la studentessa ";
			break;
			
			default:
				System.out.println("errore");
		}
		if(!message.equals("")) {
			
			System.out.printf("%s migliore e': %s con la media di: %.1f %n", message, best.getFullName(), best.getAvgVote());
			
		}

}
	
}
