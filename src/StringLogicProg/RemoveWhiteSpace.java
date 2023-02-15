package StringLogicProg;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s="My name Is Vijaya";
		s=s.replaceAll("\\s+", "");
		System.out.println(s);

	}

}
