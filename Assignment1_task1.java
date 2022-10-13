package assignments;

public class Assignment1_task1 {

	//Task 1 – Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10//
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		System.out.println("Before Snap");
		System.out.println("First Number= "+ a);
		System.out.println("Second Number= "+b);
		
		int snap=a;
		a=b;
		b=snap;
		
		System.out.println("After Snap");
		System.out.println("First number= "+a);
		System.out.println("Second number= "+b);

	}

}
