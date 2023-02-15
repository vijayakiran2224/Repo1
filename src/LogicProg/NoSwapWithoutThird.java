package LogicProg;

public class NoSwapWithoutThird {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("No before swapping a="+a+" and b="+b);
		a=a+b;
        b=a-b;//a+b-b
        a=a-b;//a+b-a
        System.out.println("No after swapping a="+a+" and b="+b);
        
	}

}
