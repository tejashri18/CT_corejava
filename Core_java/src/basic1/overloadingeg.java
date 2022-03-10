package basic1;

public class overloadingeg {
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	void add(int a,float b)
	{
		float c=a*b;
		System.out.println(c);
	}

	
	public static void main(String[] args) {
		
		overloadingeg ol=new overloadingeg();
		ol.add(12, 12);
		ol.add(12, 2f);
		
	}

}
