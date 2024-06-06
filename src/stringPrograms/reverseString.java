package stringPrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello!";
		String reveresed ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reveresed+=str.charAt(i);
		}
		System.out.println(reveresed);

	}

}
