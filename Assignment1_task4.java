package assignments;

public class Assignment1_task4 {

	//Write a program to print all prime numbers from 1-1000//
	
	public static void main(String[] args) 
	{
		int primeNumber;
		  int n = 1;
		  int divisibleCount;

		  while (n <= 1000) {
		   divisibleCount = 0;
		   primeNumber = 2;
		   while (primeNumber <= n / 2) {
		    if (n % primeNumber == 0) {
		     divisibleCount++;
		     break;
		    }
		    primeNumber++;
		   }
		   if (divisibleCount == 0 && n != 1) {
		    System.out.print(n + " ");
		   }
		   n++;
		}

	}

}
