package StringLogicProg;

public class NoOfSpacesInString {

	public static void main(String[] args) {
		
	     String s="my name is vijaya";
	     int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				count++;
			}

	    }
		System.out.println("no of Spaces:"+count);
	}
}
