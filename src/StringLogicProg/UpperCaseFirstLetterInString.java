package StringLogicProg;

public class UpperCaseFirstLetterInString {

	public static void main(String[] args) {
		String s="goodmorning";
		//System.out.println(s.toUpperCase());
		//first to get first character then uppercase it and concate to remaining string
		String firstLetter=s.substring(0,1);
		String UpperFirstLetter=firstLetter.toUpperCase();
		String Remaining=s.substring(1);
		String finalString = UpperFirstLetter+Remaining;
		System.out.println(finalString);

	}

}
