package ArrayLogical;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) 
	{
		
        String s="my my Name name is vihan";
        HashMap<String,Integer> hp=new HashMap<String,Integer>();
        String[]s1=s.split(" ");
        for(int i=0;i<=s1.length-1;i++)
         {   
        	String word=s1[i];
        	//System.out.println(word);
        	if(hp.containsKey(word))
        	{
        		hp.put(word,hp.get(word)+1);
        	}
        	else
        	{
        		hp.put(word,1);
        	}
        }
       // System.out.println(hp);
        Set<String>allkeys=hp.keySet();
        for(String key:allkeys)
        {
        	if(hp.get(key)>1)
        	{
        		System.out.println(key+":"+hp.get(key));
        	}
        }
	}

}
