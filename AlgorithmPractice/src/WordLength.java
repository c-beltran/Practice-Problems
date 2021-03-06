//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//If the last word does not exist, return 0.
//
//Note: A word is defined as a character sequence consists of non-space characters only.
//
//Example:
//
//Given s = "Hello World",
//
//return 5 as length("World") = 5.
//
//Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.

public class WordLength {
	
	public static void main(String[] args){
		WordLength word1 = new WordLength();
		WordLength word2 = new WordLength();
		System.out.println("Count of the first word: " + word1.lengthOfLastWord("New York"));
		System.out.println("Count of the first word: " + word2.lengthOfLastWord("testing double space-  "));
	}
	
	public int lengthOfLastWord(String word){
		int wordCount=0;
		//trim() deleted the spaces that are before and after a word
		String givenWord = word.trim();
		for(int i=0; i<givenWord.length(); i++){
			if(givenWord.charAt(i) == ' '){
				wordCount = 0;
			}
			else{
				wordCount++;
			}
		}
		return wordCount;
	}
}

/* PREVIOUS APPROACH
public int lengthOfLastWord(final String a) {
	int wordCount = 0;
	String aw = a.trim();
	for(int i=0; i<aw.length(); i++){
	    wordCount++;
		if(aw.charAt(i) == ' ' ){
			for(int j=i+1; j<aw.length(); j++){
				wordCount++;
			}
		}
	}
	return wordCount;
}
*/