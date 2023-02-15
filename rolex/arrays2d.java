import java.util.Iterator;
import java.util.Scanner;

public class arrays2d1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter row");
int row =sc.nextInt();
System.out.println("enter the col");
int col=sc.nextInt();
int arr[][]=new int[row][col];
System.out.println("enter "+row*col+"elements");
for (int i = 0; i < arr.length; i++)
{
for (int j = 0; j < arr[i].length; j++)
{
arr[i][j]=sc.nextInt();	
}	
}
for (int i = 0; i < arr.length; i++)
{
for (int j = 0; j < arr[i].length; j++) 
{
System.out.print(arr[i][j]);	
}	
System.out.println();
}
int ans=new int[arr.length][arr[0].length];
for (int i = 0; i < ans.length; i++)
{
for (int j = 0; j < ans[i].length; j++)
{
	arr[i][j]=ans[j][i];
}	
System.out.println();
}
for (int i = 0; i < ans.length; i++)
{
for (int j = 0; j < ans[i].length; j++)
{
System.out.print(ans[i][j]);	
}	
System.out.println();
}
}
}


