package PatternProgram;

public class StarTriangle {

	public static void main(String[] args) {
		/*   *
		 *  * *
		 * * * *
		 */
		
		int star=1;
		int space=2;
		
		for(int i=1;i<=3;i++)
		{    
			
			//for loop for space
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			star++;
			System.out.println();
				
		}

	}

}
