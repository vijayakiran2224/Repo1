package StringLogicProg;

public class ConvertUpperToLowerAndLowerToUpper {

	public static void main(String[] args) {
		String str="Good Morning";
		StringBuffer newStr=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			//to check character uppercase or lower
			if(Character.isLowerCase(ch))
			{
				//convert to uppercase
				newStr.setCharAt(i,Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch))
			{
				newStr.setCharAt(i,Character.toLowerCase(ch));
			}
		}
		
		System.out.println(newStr);

	}

}
