package StringLogicProg;

public class PallimdromeString {
 public static void main(String args[])
  {
	
	String s="abba";
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	
	System.out.println("Reverse String: "+rev);
	
	
	if(rev.equals(s))
	 {
		System.out.println("string is pallimdrome");
	 }
	 else
	 {
		System.out.println("String is not pallimdrome");
	 }
 }
}
