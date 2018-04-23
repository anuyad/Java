
public class StringMethod {
	public static void main (String args[]) {
		System.out.println(greet(name: "Elizabeth"));
		System.out.println(greet(name: "Darcy"));
		System.out.println(greet(name: "Jane"));
		System.out.println(greet(name: "Emma"));
	}	
	public static String greet (String name) {
		return String.format("Hello, %s, Welcome to Java", name);
	}
}
