package stringPrograms;

public class AltUppercase {
   
    public static void main(String[] args) {
       String str = "helloworld!";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
        	char c=str.charAt(i);
        			if(i%2==0)
        			{
        				sb.append(Character.toUpperCase(c));
        			}else
        			{
        				sb.append(c);
        			}
        }
        String result=sb.toString();
        System.out.println(result);  
    }
}
