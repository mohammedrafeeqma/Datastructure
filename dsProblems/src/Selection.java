
public class Selection {
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		int[] arr= {8,3,9,6,1,5};
		int[] result=selectionSort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

}
