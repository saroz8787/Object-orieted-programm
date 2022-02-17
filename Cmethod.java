package objects;
import java.util.Scanner;
public class Cmethod {

	public void eat()
	{
		System.out.println("I AM EATING");
	}
	
	public void run()
	{
	   System.out.println("I am running ");
	}
	public static void main(String[] args) {
		
           Cmethod s1=new Cmethod();
           s1.eat();
           s1.run();
	}

}
