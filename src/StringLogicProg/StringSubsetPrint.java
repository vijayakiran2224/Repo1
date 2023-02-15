package StringLogicProg;

public class StringSubsetPrint {

	public static void main(String[] args) {
	   String s="FUN";
	   int len=s.length();
	   int noOfSubset=(len*(len+1))/2;
	   //create array to store string subset
	   String arr[]=new String[noOfSubset];
	   int index=0;
	   for(int i=0;i<len;i++)
	   {
		   for(int j=i;j<len;j++)
		   {
			   String part=s.substring(i,j+1);
			   arr[index]=part;
			   index++;
		   }
	   }
	   
	   System.out.println("String all subset are");
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }

	}

}
