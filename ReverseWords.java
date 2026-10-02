package inClassExerciseOct02;

public class ReverseWords {

	public static void main(String[] args) {
		
		String string = "Hello World!";
		reverseWords(string);
		
		
	}
	public static String reverseWords (String str) {
		int index;
		char chEmpty = ' ';
		int endIndex = 0;
		
		
		for (index = str.length()-1; index > 0; index--) {
			System.out.print((str.charAt(index)));
			char ch = str.charAt(index);
			
			if (chEmpty == ch) {
				endIndex += index -1;
				break;
			}
		for (int i = 0 ; i < endIndex; i++) {
			System.out.print(str.charAt(i));
		}
			
		}
		
		
	
		
		
		return str;
		
	}
}
