package basic1;

class Parent
{
	void show()
	{
		System.out.println("This is parent class method");
	}
}

class Child extends Parent
{
	void pay()
	{
		System.out.println("This is child class method");
	}
}

class  Grandchild extends Child
{
	void print()
	{
		System.out.println("This is grandchild class method");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Grandchild gc=new Grandchild();
		gc.show();
		gc.pay();
		gc.print();

	}

}
