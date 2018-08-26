package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] string= {"Zoo","Lion", "Eagle"};
		randomStringPrint(string);


	}
	public static void stringPrint(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	public static void backwardsStringPrint(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[s.length-1-i]);
		}
	}
	public static void everyOtherStringPrint(String[] s) {
		for (int i = 0; i < s.length; i+=2) {
			System.out.println(s[i]);
		}
	}
	public static void randomStringPrint(String[] s) {
		int random;
		Random r =new Random();
		ArrayList<Integer> used=new ArrayList<Integer>();
		while (used.size()<s.length) {
			random=r.nextInt(s.length);
			
			if (arrayChecker(random,used)) {
				used.add(random);
				System.out.println(s[random]);
			}

		}
	}
	public static boolean arrayChecker(int input, ArrayList<Integer> useded){
		for (int i = 0; i < useded.size(); i++) {
			if (useded.get(i)==input) {
				return false;
			}
		}
		return true;
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
