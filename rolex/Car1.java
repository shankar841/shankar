class Car1
{
String car_colour;
double car_price;
char car_grade;
 Car1(String x,double y,char z)
{
  car_colour=x;
  car_price=y;
  car_grade=z;
}
public static void main(String[]args)
	{
	Car1 c1=new Car1("black",56.6,'a');
	System.out.println(c1.car_colour);
    System.out.println(c1.car_price);
	System.out.println(c1.car_grade);

	}
}
