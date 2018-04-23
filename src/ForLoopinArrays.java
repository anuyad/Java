
public class ForLoopinArrays {
	public static void main (String args[]) {
		double[] numList = {121.9, 200.9, 304.4, 312.5};
		for (int i=0; i<numList.length; i++) {
			System.out.println(numList[i]);
		}	
		
		double sum = 0;
		for (int i=0; i<numList.length;i++) {
		sum = sum + numList[i];	
		}
		System.out.println("Sum is:  "+sum);
		
		double max = numList[0];
		for (int i = 1; i < numList.length; i++ ) {
			if (numList[1] > max) {
				max = numList[1];
			}
		}
		System.out.println("Largest element in array is:" + max);
	}
}
