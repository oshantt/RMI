import java.rmi.RemoteException;

public class Testing extends normalClass {
	public static void main(String[] args) throws RemoteException{
		normalClass nc = new Testing();

        nc.setServer();
        nc.setProducts();
        nc.bindProducts();
	}
}