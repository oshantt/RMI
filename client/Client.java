import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
	public static void main(String[] args){
		try{
			// Get the references of exported object from RMI Registry...

			//locate the registry.
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

			// Get the references of exported object from the RMI Registry...
			Product p2 = (Product) registry.lookup("m");

			System.out.println( "The product name is: " + p2.getName() + ",  The price is: " + p2.getPrice());

		}catch(Exception e){
			System.out.println("Client side error..." + e);
		}
	}
}