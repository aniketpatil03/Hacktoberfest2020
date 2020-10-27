// String Array to String issue

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Solution {

	public static String stringArrayToString(String[] string) {
		String string1 = Arrays.toString(string);
		String string2 = string1.replaceAll(", ", "");
		String string3 = string2.replace("[", "");
		String string4 = string3.replace("]", "");
		return string4;
	}
	
	public static void main(String[] args) {		
		//Taking inputs
		Scanner scanner = new Scanner(System.in);
		List<String> strList = new ArrayList<String>();
		System.out.println("Note : Enter 'end' when to stop the inputs.");
		while(scanner.hasNext()) {
			String string = scanner.next();
			if(string.equals("end")) {
				break;
			}
			strList.add(string);
		}
		
		//List to array
		String strArray[] = new String[strList.size()];
		for(int i=0; i<strList.size(); i++) {
			strArray[i] = strList.get(i);
		}
		
//		System.out.println("Input String Array : ");
//		for(int i=0; i<strArray.length; i++) {
//			System.out.print(strArray[i]+"\t");
//		}
		
		//Converting String Array into String
		String finalString = stringArrayToString(strArray);
		System.out.println("\nConverted String from String Array : "+finalString);
		
		scanner.close();
	}

}
