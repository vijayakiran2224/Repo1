package ArrayLogical;

public class MiissedElementInArray {

	public static void main(String[] args) {
		int a[]= {1,3,4,5};
		//suppose total no of element is n in array
		int n=a.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			restSum=restSum+a[i];
		}
		int missele=sum-restSum;
		System.out.println(missele);

	}

}
