import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<Integer>();
		List<Integer> inputCount = new ArrayList<Integer>();
		int counter = 0;
		
		//Input dynamically
		System.out.println("Note : To end row give input -1 and to end the input give -2.");
		while(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num < -1) {
				inputCount.add(counter);
				break;
			}
			else if(num == -1) {
				inputCount.add(counter);
				counter = 0;
			}
			else {
				inputs.add(new Integer(num));
				counter++;
			}
		}
		
		//Initializing array with given inputs
		int A[][] = new int[inputCount.size()][];
		for(int i=0; i<inputCount.size(); i++) {
			A[i] = new int[inputCount.get(i)];
		}
		
		//Putting elements into array
		Iterator<Integer> iterator = inputs.iterator();
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				A[i][j] = iterator.next();
			}
		}
		
		//Printing An Array
		System.out.println("Array :- ");
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
