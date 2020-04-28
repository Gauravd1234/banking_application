import java.util.*; 
import java.io.*; 

public class Client{
	private String name; 
	private static int ID = 0; 
	private int age; 
	private int money; 
	public Client(String name, int age, int money){
		this.name = name; 
		this.age = age; 
		this.money = money; 
	}

	public void deposit(int n){
		money += n; 
	}
	public void withdraw(int n){
		money -= n; 
	}
	public String getName(){
		return name; 
	}
	public int getAge(){
		return age; 
	}
	public int getMoney(){
		return money; 
	}
}