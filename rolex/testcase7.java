class testcase7
{
	public static void main(String[] args)
	{
		int no=123456;
		int arr[]=new int [no];
		int sum=0;
		for (int i = 0; i <= arr.length; i++) 
		{
			if(i<3)
			{
				sum=sum+arr[i];
			}
			  System.out.println(sum);
		}
        
	}

}