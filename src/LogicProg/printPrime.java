package LogicProg;

public class printPrime {
	
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		// print prime no bet 1 to 10
		for(int i=1;i<=10;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}

	}

}
