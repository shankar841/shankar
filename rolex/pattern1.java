public class pattern1 
{
public static void main(String[] args)
{
int no=7;
for (int i = 1; i <=no; i++)
{
for (int j = 1; j <=no; j++) 
{
	if(i==1 ||(j==1 && i>=no/2+1) || i==no/2+1 ||(j==no &&i<=no/2+1)|| j==5)
	{
	System.out.print("*");
}	
}
System.out.println();
}
}
}

