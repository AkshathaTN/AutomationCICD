package stringPrograms;

public class removeSpecialChar {
   
    public static void main(String[] args) {
    	String str = "Hello! How are you?"; 
    	str = str.replaceAll("[^a-zA-Z0-9]", ""); 
    	System.out.println(str); // Output: "HelloHowareyou" 
    }
}
