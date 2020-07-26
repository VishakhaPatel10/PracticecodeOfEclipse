package tpTry;


public class Animal {
	
	boolean flag = true;
	{
		
	
	
	if (flag==true)
	{
		
	}
		
	
	
} 
static class Dog extends Animal
{ 
	public void printA()
	{ System.out.println("Dog");	
	} 
	Dog()
	{
		
	}
	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = (Dog) a;
		
		a.printA();
		d.printA();
	}
	
	
}
public void printA() {
	// TODO Auto-generated method stub
	
}
}
//Animal a = new Dog(); b)Dog d = new Animal(); 