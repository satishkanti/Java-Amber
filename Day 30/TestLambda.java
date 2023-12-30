interface Test    //functional interface
{
	String display(String s);
	
}

interface Operation
{
	int operate(int a,int b);
}
/*class BB implements Test
{
	public String display(String s)
	{
		
	}
}*/

/*class HH implements Test
{
	public void display()
	{
		
	}
}*/
public class TestLambda
{
	public static void main(String [] args)
	{
		/*Test ob=new Test() {
			public void display()
			{
				System.out.println("Hello..");
			}
		};
		ob.display();
		
		Test ob1=new Test() {
			public void display()
			{
				System.out.println("Welcome..");
			}
		};
		ob1.display();*/
		
		/*Test t=()->{
			System.out.println("Hello");
		};
		t.display();*/
		
		
		Test ob=(s)->{
			 return s;
			};
			System.out.println(ob.display("Hello"));
			
		Test ob1=(s)->{return s;};
		System.out.println(ob1.display("Welcome"));
		
		Operation p1=(a,b)->{
			return a+b;
		};
		Operation p2=(a,b)->{
			return a*b;
		};
		System.out.println("The sum of two numbers is "+p1.operate(10, 20));
		System.out.println("The product of two numbers is "+p2.operate(4,6));
	}
	
	}