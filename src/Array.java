
public class Array {
	public static void main (String args[]) {
		String[] studentNames = new String[] {"John", "David", "Henry", "Bob", "Victor"};
		int[] studentAge = new int[] {14, 23, 27, 30, 40};
		double[] studentGrade = new double[] {4.0, 1.0, 4.25, 3.25};
		String[] studentSubjects = new String[6];
		studentSubjects[0] = "Computer Science";
		studentSubjects[1] = "Sociology";
		studentSubjects[2] = "Mathematics";
		studentSubjects[3] = "History";
		studentSubjects[4] = "Civics";
		studentSubjects[5] = "Biology";
		
		System.out.println(studentNames[0]);
		System.out.println(studentNames[2]);
		System.out.println(studentNames[4]);
		System.out.println(studentAge[0]);
		System.out.println(studentAge[4]);
		System.out.println(studentSubjects[5]);
			
	}
}
