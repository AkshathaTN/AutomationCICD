package stringPrograms;

public class reverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence ="You so sweet";
		String reversedSentence=reverseSentence(sentence);
		System.out.println(reversedSentence);
	}
		
		private static String reverseSentence(String sentence) {
			if(sentence.isEmpty()) {
				return sentence;
			}
			return reverseSentence(sentence.substring(1)+sentence.charAt(0));
		

}
}