import java.util.*; 
import java.io.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		String name = in.next(); 
		int age = in.nextInt(); 
		int money = in.nextInt(); 
		Client person1 = new Client(name, age, money); 
		System.out.println(person1.getName()); 
	}
}