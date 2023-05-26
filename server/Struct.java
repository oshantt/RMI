import java.rmi.RemoteException;

abstract class Struct {

    abstract String getName() throws RemoteException;
	abstract String getDescription() throws RemoteException;
	abstract double getPrice() throws RemoteException;
	abstract void changeProductName(String newName) throws RemoteException;
    
}
