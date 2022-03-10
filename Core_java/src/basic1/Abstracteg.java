package basic1;

abstract class abc
{
	abstract void show();
	void print()
	{
		System.out.println("This is non abtract function");
		
	}
}

class exam extends abc
{
	void show()
	{
		
	System.out.println("This is implementation of abstract function");
	}
}
public class Abstracteg {

	public static void main(String[] args) {
		
		exam e=new exam();
		e.show();
		e.print();
		
	}

}
