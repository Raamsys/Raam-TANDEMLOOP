import java.util.*;
public class calculator{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
		System.out.println("Enter the first number");
		double n1=sc.nextInt();
		System.out.println("Enter the second number");
		double n2=sc.nextInt();
		System.out.println("Enter the operation:\n 1)Addition \n2)Subtraction \n 3)Multiplication \n 4)Division ");
		int operation=sc.nextInt();
		switch(operation){
			case 1:{
				add(n1,n2);
				break;
			}
			case 2:{
				sub(n1,n2);
				break;
			}
			case 3:{
				multi(n1,n2);
				break;
			}
			case 4:{
				div(n1,n2);
				break;
			}
		}
	}
	
		public static void add(double  n1,double  n2){
			double n=n1+n2;
			System.out.println("Addition of the numbers: "+n);
		}
		public static void sub(double  n1,double  n2){
			double  m=n1-n2;
			System.out.println("Subtraction of the numbers: "+m);
		}
		public static void multi(double  n1,double  n2){
			double  p=n1*n2;
			System.out.println("Multiplication of the numbers: "+p);
		}
		public static void div(double  n1,double  n2){
			double  c=n1/n2;
			System.out.println("Division of the numbers: "+c);
		}
	}