package exception;

public class Exceptions {

	public static void main(String[] args) {
		int arr[]=  {10,20,30,40};
		try
		{
			System.out.println("Exception started......");
			System.out.println(arr[3]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception is" + e);
			
			
			
		}
		System.out.println("Exception end......");
		
	}

}
