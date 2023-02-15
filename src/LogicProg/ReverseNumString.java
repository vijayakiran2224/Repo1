package LogicProg;

public class ReverseNumString {

	public static void main(String[] args) {
		int num=201;
		String s=Integer.toString(num);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		
		Integer.parseInt(rev);
		System.out.println("reverse num:"+rev);

	}

}
