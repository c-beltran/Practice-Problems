public class NameToInitials {

	/*
	 * write a function to convert a name in to initials. this kata stricktly takes two
	 * words with one space in between them. the output should be two capital letters with 
	 * a dot seperating the. Ex - Sam Harris => S.H
	 */
	
	public static void main(String[] Args){
		String name = "Frederick Davis";
		
		System.out.println(convertNameToInitials(name));
	}
	
	public static String convertNameToInitials(String word){
		String wordArr[];
		wordArr = word.split(" ");		
		String st = wordArr[0].charAt(0) + "." + wordArr[1].charAt(0);
		return st;
	}
}
