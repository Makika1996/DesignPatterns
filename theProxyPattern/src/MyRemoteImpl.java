import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {}

    public String sayHello(String name) {
        return "Server says, 'Hey " + name + "'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
            System.out.println("Server is running...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return "";
    }
}