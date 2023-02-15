package StringLogicProg;

public class CapitalizeEachLetter {

	public static void main(String[] args) {
		String s="my name is vijaya";
		//capitalize each word first letter
		String sArray[]=s.split(" ");
		for(int i=0;i<=sArray.length-1;i++)
		{
			String word=sArray[i];
			String CapitalWord=CapitalizeWord(word);
			System.out.print(CapitalWord+" ");
		}

	}
	
	//method to capital word
	
	public static String CapitalizeWord(String s1)
	{
		String first=s1.substring(0,1);
		String remaining=s1.substring(1);
		String Capital=first.toUpperCase()+remaining;
		return Capital;
		
	}

}
