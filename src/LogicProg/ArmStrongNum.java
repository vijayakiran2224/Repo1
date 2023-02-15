package LogicProg;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num=134;
		int sum=0;
	for(int i=num;i>0;i=i/10)
	 {
		int rem=i%10;
		sum=sum+(rem*rem*rem);
		
	 }
	if(num==sum)
	  {
		System.out.println("number is Armstrong");
	  }
	else
	  {
		System.out.println("number is not armstrong");
	  }

	}

}
