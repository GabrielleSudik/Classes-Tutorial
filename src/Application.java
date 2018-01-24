//this lesson is a little unorthodox, although it works...
//he's creating multiple classes in one page so everything is on the same screen

//here's new stuff:
//class is a template to create object

class Person {
	//classes contain:
	//(1) data (state of objects: color, heart rate, etc)
	//(2) subroutines/behavior (methods) 
	
	//instance variables (data or state):
	String name;
	int age;
	
	//methods:
	void speak(){
		System.out.println("My name is " + name + " and I am " + age + ".");
		System.out.println("My name is {name} and I am {age}.");
		//various attempts to make that work like C# didn't work. sad trombone.
	}
	
}


public class Application {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		//that declared an object of type Person
		
		person1.name = "Joe";
		person1.age = 37;
		
		Person person2 = new Person();
		
		person2.name = "Betty";
		person2.age = 40;
		
		System.out.println(person1.name);
		System.out.println(person2.name);
		
		person1.speak();
		person2.speak();
		
	}

}
