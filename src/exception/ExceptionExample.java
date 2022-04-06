package exception;

//Exceptions- interrupting the flow execution.
//Throwable is the super class for Exception & Error
//Exception - it has two types Checked Exception & Unchecked Exception
//Checked Exception- It will check at compile time eg:-IOException
//Un-Checked Exception-It will check at Runtime eg:-NullPointerException
//Error- System related issues like Out Of memory.We can not handle these errors through the code.
public class ExceptionExample {

	public String getName()
	{
		return "Sonu";
	}
	
	
	//Throws is used to declare the exception if you don't want to handle the exception right now.
	//It means some where you are handling the Exception
	public String setName(String name) throws CustomizedException
	{
		if(name.equalsIgnoreCase("sonu"))
		{
			//mainly throw is used to throw a customized exception 
			throw new CustomizedException("Customized Exception");
		}
		return name;
	}

	public static void main(String[] args) {

		ExceptionExample obj = new ExceptionExample();
		
		//try block is used to declare the code which code has the chances to throw the exception
		try {

			System.out.println("Try block");
			obj.getName();
			obj.setName("sonu");
		}
		//It will handle the exception which are throws in the try block
		catch(Exception e){

			System.out.println("Catch block");
			System.out.println(e);
		}
		//this block always will be execute irrespective exception
		//mostly we use this block to close the connections or making instances as null 
		finally{

			System.out.println("finally block");
			obj=null;
		}
	}

}
