
public class StringInterpolation {
	public static void main (String args[]) {
		String custName = "Tom";
		String streetName = "3043 C Lake Park Drive";
		int age = 25;
		String city = "Atlanta";
		String state = "Georgia";
		String zipCode = "85284";
		String country = "United States";
		
		System.out.println(String.format("Student Details: Name: %s, age: %d, Address: %s, City: %s, State: %s, zipCode: %s, country: %s", custName, age, streetName, city, state, zipCode, country));
	}
}
