import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciImpl extends UnicastRemoteObject implements Fibonacci {

	public FibonacciImpl() throws RemoteException {
		
	}
	
	// @reference http://crunchify.com/write-java-program-to-print-fibonacci-series-upto-n-number/
	public int fib(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibonacci;
	}

	public static void main(String args[]){
		try {
			FibonacciImpl obj = new FibonacciImpl();
			// Bind this object instance to the name "FibServer"
			Naming.rebind("FibServer", obj);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
}