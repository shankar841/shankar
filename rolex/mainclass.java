 class mainclass
 {
public static void main(String args[])

{
	int no=371;
	int sum=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	if(sum==copy)
	{
		System.out.println("it is amstrng number") ;
		
	}
	else
	{
		System.out.println("it is not amstrng number") ;
	}
}
 }