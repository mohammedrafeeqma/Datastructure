
public class Duplicate {
	public static void FindDuplicate(String arr) {
		int count;
		char[] charArray=arr.toCharArray();
		for(int i=0;i<arr.length();i++)
		{
			count=1;
			for(int j=i+1;j<arr.length();j++)
			{
				if(charArray[i]==charArray[j])
				{
					count++;
					charArray[j]='0';
				}
			}
			if(count>1&&charArray[i]!='0')
			{
				System.out.println(charArray[i]+"-"+count);
			}
			
		}
	}
	public static void main(String arg[])
	{
		
		String arr="aaabbc";
		FindDuplicate(arr);
	}

}
