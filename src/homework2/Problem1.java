package homework2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Sentence to reverse:");
		 String sentence = in.nextLine();
	        String[] words = sentence.split("\\s+");
	        for(int i = words.length - 1; i > 0; i--) {
	        	System.out.print(words[i]);
	        	System.out.print(" ");
	        }
	        System.out.print(words[0]);
	        in.close();
	}

}
