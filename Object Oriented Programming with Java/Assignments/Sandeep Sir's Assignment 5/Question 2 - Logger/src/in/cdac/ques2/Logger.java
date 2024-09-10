package in.cdac.ques2;

public class Logger {                 //Singleton Class
	private static Logger l1;
	private static String message;
	
	static {
		Logger.l1 = null;
		Logger.message="";
	}
	
	private Logger() { //private constructor to restrict creation of instance from outside the class
		
	}


	
	
	
	public static Logger getInstance() {
	if(Logger.l1 == null) {             //check if there is no instance inside reference l1
		Logger.l1 = new Logger();       //only create new instance of Logger Class if there is no instance present in reference l1
		}
	return l1;
	}
	
	
	public void log(String message) {
		
		Logger.message = message;
		
	}
	
	public String getLog(){
		return Logger.message;
	}
	
	public void clearLog() {
		Logger.message = "";
		
	}
	
}
