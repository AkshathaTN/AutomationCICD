package stringPrograms;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ip="madam";
		String op="";
		for(int i=0;i<ip.length();i++)
		{
			boolean check = false;
			for(int j=0;j<op.length();j++) {
				
				if(ip.charAt(i)==op.charAt(j)) {
					check=true;
					break;
				}
			}
			if(!check) {
				op=op+ip.charAt(i);
			}
		}
		System.out.println(op);
		
	}
		
		
		

}