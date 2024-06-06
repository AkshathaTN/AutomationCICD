package stringPrograms;

public class swapTwoStrings {
   
    public static void main(String[] args) {
    	String a = "Hello"; 
    	String b="World";
    	System.out.println("Befor swap:" +a+ " "+b);
    	a=a+b;
    	b=a.substring(0,a.length()-b.length());
    	a=a.substring(b.length());
    	System.out.println("After Swap:" +a+" "+b);
    }
}
