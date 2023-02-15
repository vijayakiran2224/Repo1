package ArrayLogical;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String s="abbacd";
		HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(hp.containsKey(c))
			{
				hp.put(c,hp.get(c)+1);
			}
			else
			{
				hp.put(c,1);
			}
		}
		
		Set<Character>allKeys=hp.keySet();
		for(Character key:allKeys)
		{
			System.out.println(key+":"+hp.get(key));
		}
		
		System.out.println("duplicate character in string");
		
		for(Character key:allKeys)
		{   
			if(hp.get(key)>1)
			System.out.println(key+":"+hp.get(key));
		}
		

	}

}
