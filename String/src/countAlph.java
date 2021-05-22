
public class countAlph {
	
	public int count(String str)
	{
		int i=0;
		char[] charArray=new char[(str.length())];
		
		while(i<str.length())
		{
			int count=0;
			int j=i+1;
			while(j<str.length())
			{
				if(charArray[i]==charArray[j])
				{
					count=count+1;
				}
			}
			System.out.println(count);
		}
		
	}

}
