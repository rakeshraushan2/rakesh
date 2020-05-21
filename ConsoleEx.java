import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {

		Console c=System.console();
		System.out.println("Enter name");
		try{
	
String n=c.readLine();
System.out.println("Welcome "+n);
		}catch(NullPointerException e){System.out.println("caught ");}
		
	} yes

}