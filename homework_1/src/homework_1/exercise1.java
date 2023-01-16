package homework_1;

import java.util.Scanner;


public class exercise1 {

	//int age = 40;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner class for taking input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey, enter your age:");
		
		int age = sc.nextInt();
		//taking if and else condition
		
		
		
		if(age>50) {
			
			System.out.println("you entered  "+ age + ""
					+ "So, you are above 50");
		}else
		{
			System.out.println("Hey,you are under 50");
		}
		
		

	}

}
