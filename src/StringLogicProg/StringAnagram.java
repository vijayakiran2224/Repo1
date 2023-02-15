package StringLogicProg;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// strings are anagram if having same character in any sequence
		
		String s1="Grab";
		String s2="Brag";
		
		//firstly we check both string having same length
		if(s1.length()!=s2.length())
		{
			System.out.println("String are not anagram");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char s1Array[]=s1.toCharArray();
			char s2Array[]=s2.toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			boolean result=Arrays.equals(s1Array, s2Array);
			if(result==true)
			{
				System.out.println("Strings are Anagram");
			}
			
		}

	}

}
