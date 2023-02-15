package StringLogicProg;

import java.util.HashMap;
import java.util.Set;

public class DupLicateCharInString {

	public static void main(String[] args) {
		String s="abbcad";
		HashMap<Character,Integer>hp=new HashMap<Character,Integer>();
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
		Set<Character>allkeys=hp.keySet();
		for(Character key:allkeys)
		{
			System.out.println(key+":"+hp.get(key));
		}
		
		System.out.println("duplicate character");
		for(Character key:allkeys)
		{
			if(hp.get(key)>1)
			{
				System.out.println(key+":"+hp.get(key));
			}
		}

	}

}
