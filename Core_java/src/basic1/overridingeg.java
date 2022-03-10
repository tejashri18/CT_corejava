package basic1;


class Day
{
	void operations(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}

class Month extends Day
{
	void operations(int a,int b)
	{
		super.operations(12,4);
		int c=a*b;
		System.out.println(c);
	}
}
public class overridingeg {

	public static void main(String[] args) {
		
		Month c=new Month();
		c.operations(12, 43);
		
	}

}
