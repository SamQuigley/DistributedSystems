import java.rmi.Naming;
import java.rmi.RemoteException;

public class FibonacciClient {

	// call the main method like 'java FibonacciClient localhost 20
	// verify the answer at https://www.mathsisfun.com/numbers/fibonacci-sequence.html
	public static void main(String args[]) {
		
		String hostname = "localhost";
		int n = 10;
		
		if (args.length > 0){
			hostname = args[0];
			n = Integer.parseInt(args[1]);
		}

		try {
			System.setProperty("java.rmi.server.hostname", hostname);
			// obtain a proxy object for the implementation which is running on the server
			// server is specified by hostname
			Fibonacci obj = (Fibonacci) Naming.lookup( "//" + hostname + "/FibServer"); 
			System.out.println(obj.fib(n));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
