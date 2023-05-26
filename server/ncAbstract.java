import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public abstract class ncAbstract implements ncInterface{
    
    public void setServer() throws RemoteException{
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
    }

    public abstract void setProducts() throws RemoteException;
    public abstract void bindProducts() throws RemoteException;
}
