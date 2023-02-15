package StringLogicProg;

public class StringVowelsCount {

	public static void main(String[] args) {
		String s="welcome";
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u')
			{
				Vcount++;
			}
			else if(c>'a'||c<='z')
			{
				Ccount++;
			}
		}
		System.out.println("no of Vowels:"+Vcount);
		System.out.println("no of consonent:"+Ccount);
				

	}

}
