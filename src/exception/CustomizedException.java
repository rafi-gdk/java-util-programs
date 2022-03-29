package exception;

// 1. extends the Exception
// 2. create String based constructor & pass the message in super 
public class CustomizedException extends Exception{

	private static final long serialVersionUID = 1L;

	CustomizedException(String message){
		
		super(message);	
	}
}
