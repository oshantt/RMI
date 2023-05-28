import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class normalClass extends ncAbstract{
    private ProductImpl p1;
    private ProductImpl p2;
    private ProductImpl p3;
    private ProductImpl p4;

    public void setProducts() throws RemoteException{
        p1 = new ProductImpl("Laptop","Lenovo Laptop", 1740);
        p2 = new ProductImpl("Mobile","Mi mobile", 241);
        p3 = new ProductImpl("Power Charger","Lenovo Charger", 841);
        p4 = new ProductImpl("MotorBike","Yamaha Biker", 44);
    }

    public void bindProducts() throws RemoteException{
        try {
            Product stub1 = (Product) UnicastRemoteObject.exportObject(p1, 0);
            Product stub2 = (Product) UnicastRemoteObject.exportObject(p2, 0);
            Product stub3 = (Product) UnicastRemoteObject.exportObject(p3, 0);
            Product stub4 = (Product) UnicastRemoteObject.exportObject(p4, 0);
            registry.rebind("l", stub1);
            registry.rebind("m", stub2);
            registry.rebind("c", stub3);
            registry.rebind("b", stub4);

            System.out.println("Exporting and binding of Objects has been completed...");
        } catch (Exception e) {
            System.out.println("Error binding products..." + e);
        }
    }
}
