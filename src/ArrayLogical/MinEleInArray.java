package ArrayLogical;

public class MinEleInArray {

	public static void main(String[] args) {
		int a[]={20,5,40,10};
		
		//assume first ele is min
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimun element in array="+min);
		

	}

}
