class Flipcart
{
void cloth()
{
System.out.println("need cloth");
}
}




class Ekart
{
public static void main(String[]args)
{
Flipcart f1=new Flipcart();
Customer.needcloth(f1);
}
}





class Customer
	{
static void needcloth(Flipcart f2)
{
f2.cloth();
}
}
