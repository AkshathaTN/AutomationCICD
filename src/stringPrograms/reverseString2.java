package stringPrograms;

public class reverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello!";
		StringBuilder sb= new StringBuilder(str);
		String reveresed =sb.reverse().toString();
		System.out.println(reveresed);

	}

}
