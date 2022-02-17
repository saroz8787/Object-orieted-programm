package objects;
import java.util.Scanner;

public class Method {
	
	  public void multiply()
      {
		  int a; int b; int c;
		  Scanner sc=new Scanner(System.in);
   	   System.out.println("Enter first number");
   	   a=sc.nextInt();
   	   System.out.println("Enter second number");
   	   b=sc.nextInt();
   	   c=a*b;
   	   System.out.println("The multiplication of "+a+" and "+b +  " is ="+c);
   	  
      }

	public static void main(String[] args) {
		
		Method m=new Method();
		m.multiply();

	
	}

}
