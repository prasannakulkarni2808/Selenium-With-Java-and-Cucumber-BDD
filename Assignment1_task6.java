package assignments;

public class Assignment1_task6 {

	//Task 4- Write a program to print all even numbers from 1-200//
	
	public static void main(String[] args) 
	{
		int a=200;
				
		System.out.println("List of even numbers from 1 to "+ a);
		for (int i=1;i<a;i++)
		{
			if(i%2==0)
				
				System.out.println(i+"");
		}

	}

}
