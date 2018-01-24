import java.rmi.Naming;
import java.rmi.RemoteException;

// https://docs.oracle.com/javase/7/docs/api/java/rmi/Naming.html provides a useful resource understand the naming
public class HelloClient {

	public static void main(String args[]) {
		
		String hostname = "localhost";
		
		if (args.length>0){
			hostname = args[0];
		}

		try {
			System.setProperty("java.rmi.server.hostname", "ec2-34-248-27-210.eu-west-1.compute.amazonaws.com");
			// obtain a proxy object for the implementation which is running on the server
			// server is specified by hostname
			Hello obj = (Hello) Naming.lookup( "//" + hostname + "/HelloServer"); 
			System.out.println(obj.sayHello());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
