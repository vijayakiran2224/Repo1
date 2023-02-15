package StringLogicProg;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {
		String s="jay ram shree ram";
		HashMap<String,Integer> hp=new HashMap<String,Integer>();
		String[] StringWords=s.split(" ");
		for(int i=0;i<=StringWords.length-1;i++)
		{
			String word=StringWords[i];
			if(hp.containsKey(word))
			{
				hp.put(word,hp.get(word)+1);
			}
			else
			{
				hp.put(word,1);
			}
		}
		
		Set<String> allkeys=hp.keySet();
		for(String key:allkeys)
		{   if(hp.get(key)>1)
		    {
			  System.out.println(key+":"+hp.get(key));
		    }
		}
		

	}

}
