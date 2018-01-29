import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	public HelloImpl() throws RemoteException {
		
	}
	
	public String sayHello(){
		return "Hello world!"; 
	}

	public static void main(String args[]){
		try {
		
			HelloImpl obj = new HelloImpl();
			// Bind this object instance to the name "HelloServer"
			Naming.rebind("HelloServer", obj);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		// try{
		// 	java.rmi.registry.LocateRegistry.createRegistry(1099);
		// 	System.out.print("RMI Rehistry is ready to party..");
		// }catch(Exception e){
		// 	System.out.println("Exception, RMI Registry is not ready to party.");
		// 	e.printStackTrace();
		// }

	}
	
}