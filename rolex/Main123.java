class Single
{
 int a=40;
 }
 class Demo extends Single
{
  void test(){
  System.out.println("heello");
  }
}
 class Test extends Demo
{
  void A(){
  System.out.println("hireeii");
  }
}

 class Demo0 extends Single
{
  void disp(){
  System.out.println("hiii");
  }
}
class Main123
{

  public static void main(String [] args){
  Demo0 d1=new Demo0();
  d1.disp();
  System.out.println(d1.a);
	Demo d2=new Demo();
	d2.test();
	System.out.println(d2.a);
	Test t1=new Test();
	t1.A();
	t1.test();
	System.out.println(t1.a);

  }
  }