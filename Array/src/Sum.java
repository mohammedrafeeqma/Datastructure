import java.util.Scanner;

public class Sum {
	  public static int[] twoNumberSum(int[] ar,int target) {
		  for(int i=0;i<ar.length;i++)
		  {
			  for(int j=0;j<ar.length;j++)
			  {
				  if(ar[i]+ar[j]==10)
				  {
					  return new int[]{ar[i],ar[j]};
				  }
			  }
		  }
		return new int[0];
	  }
	  public static void main(String arg[])
	  {
		  int[] ar=new int[7];
		  int target=10;
		  Scanner sc=new Scanner(System.in);
		  for(int i=0;i<6;i++)
		  {
			  ar[i]=sc.nextInt();
		  }
		  int[] result=twoNumberSum(ar,target);
		  for(int i=0;i<result.length;i++)
		  {
			  System.out.println(result[i]);
		  }
	  }

}
