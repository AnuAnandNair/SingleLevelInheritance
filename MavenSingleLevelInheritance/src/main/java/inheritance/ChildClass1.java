package inheritance;

public class ChildClass1 extends ParentClass1{
	
	public void diff() {
		int diff=a-b;
		System.out.println("the difference is "+diff);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 c1=new ChildClass1();
		c1.diff();
		c1.add();
		System.out.println("The value of a is "+c1.a);
		System.out.println("The value of b is "+c1.b);

	}

}
