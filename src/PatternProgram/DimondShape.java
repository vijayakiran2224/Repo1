package PatternProgram;

public class DimondShape {

	public static void main(String[] args) {
		/*      *
		 *     * *
		 *    * * *
		 *   * * * *
		 *    * * *
		 *     * *
		 *      *
		 * 
		 */
		
		int star=1;
		int space=3;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			if(i<4)
			{
				space--;
				star++;
			}
			else if(i>=4)
			{
				space++;
				star--;
			}
			System.out.println();
		}

	}

}
