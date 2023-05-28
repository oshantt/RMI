import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public abstract class ncAbstract implements ncInterface{
    protected Registry registry;
    
    public void setServer() throws RemoteException{
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
            System.out.println("Server has been started...");
        } catch (Exception e) {
            System.out.println("Error setting server..." + e);
        }
    }

    public abstract void setProducts() throws RemoteException;
    public abstract void bindProducts() throws RemoteException;
}
