class Car2
{
String x;
double y;
char z;
 Car2(String x,double y,char z)
{
 this.x=x;
  this.y=y;
  this.z=z;
}
public static void main(String[]args)
	{
	Car2 c1=new Car2("black",56.6,'a');
	System.out.println(c1.x);
    System.out.println(c1.y);
	System.out.println(c1.z);

	}
}
