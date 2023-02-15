class min
{
public static void main(String[]args)
{
int[] arr={10,3,8,2,9};
int min1=arr[0];
int min2=0;
for(int i=1;i<=arr.length-1;i++)
{
if(arr[i]<min1)
{
	min2=min1;
min1=arr[i];
}
else if(arr[i]<min2)
	{
	min2=arr[i];
}
}
System.out.println(min2);
}
}
