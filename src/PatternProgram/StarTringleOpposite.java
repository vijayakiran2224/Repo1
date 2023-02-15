package PatternProgram;

public class StarTringleOpposite {

	public static void main(String[] args) {
		/*  * * * *
		 *   * * *
		 *    * *
		 *     *
		 */
		int star=4;
		int space=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(int j=1;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			star--;
			System.out.println();
		}

	}

}
