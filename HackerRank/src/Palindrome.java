
public class Palindrome {

	public static void main(String[] args){
		String palindrome = "queensBridge";
		
		String print = palinCheck(palindrome);
		System.out.println(print);
	}
	
	public static boolean isPalindrome(String word){
		int wordSize = word.length();
		String temp = "";
		for(int i = wordSize -1; i >= 0; i--){
			temp = temp + word.charAt(i);
		}
//		System.out.println(temp);
		if(word.equals(temp)){
			return true;
		}
		
		return false;
	}
	
	public static String palinCheck(String word){
		if(isPalindrome(word)){
			return word;
		}
		return "Not a palindrome";
	}
}
