
public class Switch {
	public static void main (String args[]) {
		String grade = "B-";
		switch(grade) {
			case "A+":
				System.out.println("Great student");
				break;
			case "A":
				System.out.println("Great student");
				break;	
			case "A-":
				System.out.println("Great student");
				break;
			case "B+": case "B":
			case "B-":	
				System.out.println("Good student");
				break;
			case "C+": case "C":
			case "C-":	
				System.out.println("Poor student");
				break;
			case "D+": case "D":
			case "D-":	
				System.out.println("Very poor student");
				break;
			default:	
				System.out.println("You have failed");		
				break;
		}
	}
}
