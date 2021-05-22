import java.util.Scanner;

public class Lastsinglechar {
	
	public static void main(String arg[]) {
		int k=0,count,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		
	
		for(int i=0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					
					arr[j]='0';
				}
				
				
			}
			if(count==1&&arr[i]!='0')
			{
				
				
				c=i;
			}
			
			
		}
		System.out.println(arr[c]);
		
				
	}

}