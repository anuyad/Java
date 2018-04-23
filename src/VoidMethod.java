
public class VoidMethod {
	public static void main (String args[]) {
		greet( name: "Elizabeth");
		greet( name: "Darcy");
		greet( name: "Jane");
		greet( name: "Willow");		
	}
	
	public static void greet (String name) {
		System.out.println(String.format("Hello, %s", name));
		
	}
}
