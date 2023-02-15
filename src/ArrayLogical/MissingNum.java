package ArrayLogical;

public class MissingNum {

	public static void main(String[] args) {
		int a[]={1,4,5,2};
		int missNum=MissingNum(a);
		System.out.println("Missing Element in array:"+missNum);

	}
	public static int MissingNum(int a[])
	{
		int n=a.length+1;//total num in array
		int sum=n*(n+1)/2;//total sum of all array element
		int restsum=0;// sum of array element except missing element
		for(int i=0;i<=a.length-1;i++)
		{
			restsum=restsum+a[i];
		}
		
		int missingNum=sum-restsum;
		return missingNum;
	}

}
