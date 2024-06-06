package stringPrograms;

public class CountOfCharacters {

	  public static void main(String[] args) {
		  
	 
	String s ="The best of both";
	int count =0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ')
			count++;
	}
	System.out.println("The count is:" +count); // Output: Helle!
}
}

