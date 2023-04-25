import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
	public static void main(String[] args){
		try{
			// Get the references of exported object from RMI Registry...

			//locate the registry.
			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

			// Get the references of exported object from the RMI Registry...
			Product p1 = (Product) registry.lookup("l");
			Product p2 = (Product) registry.lookup("m");
			Product p3 = (Product) registry.lookup("c");
			Product p4 = (Product) registry.lookup("b");

			System.out.println( "The product name is: " + p2.getName() + ",  The price is: " + p2.getPrice());

		}catch(Exception e){
			System.out.println("Client side error..." + e);
		}
	}
}