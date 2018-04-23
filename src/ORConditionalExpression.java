
public class ORConditionalExpression {
	public static void main (String args[]) {
		double account_balance = 1050600.84;
		int age = 55;
		if (account_balance >= 1000000 ||age >= 65) {
			System.out.println("You can retire now, Good Luck !");
		} else {
			System.out.println("You need to save money for your retirement.");
        }
    }
}
