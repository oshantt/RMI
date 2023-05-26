import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;

public class Server{
	public static void main(String[] args){
		try{

			System.setProperty("java.rmi.server.hostname", "127.0.0.1");
			System.out.println("Server has been started...");

			ProductImpl p1 = new ProductImpl("Laptop","Lenovo Laptop", 1740);
			ProductImpl p2 = new ProductImpl("Mobile","Mi mobile", 241);
			ProductImpl p3 = new ProductImpl("Power Charger","Lenovo Charger", 841);
			ProductImpl p4 = new ProductImpl("MotorBike","Yamaha Biker", 44);

			Product stub1 = (Product) UnicastRemoteObject.exportObject(p1, 0);
			Product stub2 = (Product) UnicastRemoteObject.exportObject(p2, 0);
			Product stub3 = (Product) UnicastRemoteObject.exportObject(p3, 0);
			Product stub4 = (Product) UnicastRemoteObject.exportObject(p4, 0);

			Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

			registry.rebind("l", stub1);
			registry.rebind("m", stub2);
			registry.rebind("c", stub3);
			registry.rebind("b", stub4);

			System.out.println("Exporting and binding of Objects has been completed...");

		}catch(Exception e){
			System.out.println("Some server error..." + e);
		}
	}
}


// CLI Server - start rmiregistry 9100
// CLI Server - compile and run
// CLI Client - compile and run