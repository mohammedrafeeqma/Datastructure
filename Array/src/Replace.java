
public class Replace {
	public static void Last(int[] ar,int target)
	{
		int i=0,j=ar.length-1;
		while(i<j)
		{
			while(i<j&&ar[j]==target)
			{
				j--;
			}
			if(ar[i]==target)
			{
				int temp=ar[j];
				ar[j]=ar[i];
				ar[i]=temp;
				
			}
			i++;
		}
		for(i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	
	public static void main(String arg[])
	{
		int[] ar= {6,1,8,10,4,15,6,3,9,6};
		int target=6;
		Last(ar,target);
		
	}

}
