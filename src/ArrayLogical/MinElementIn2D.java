package ArrayLogical;

public class MinElementIn2D {

	public static void main(String[] args) 
	{
		int a[][]= {{10,5},{30,4},{40,3}};
		
		 int rowLength=a.length;
		 int colLength=a[0].length;
		 
		 int min=a[0][0];
		 
		 for(int i=0;i<rowLength;i++)
		 {
			 for(int j=0;j<colLength;j++)
			 {
				 if(min>a[i][j])
				 {
					 min=a[i][j];
				 }
				 
			 }
		 }
		 System.out.println("min element in array:"+min);
        
	}

}
