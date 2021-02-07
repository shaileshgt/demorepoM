
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int i = 100/0;
			System.out.println("try this");
		}
		catch(Exception E) 
		{
			System.out.println("catch");
		}
		finally 
		{
			System.out.println("finally");
		}
	}

}

