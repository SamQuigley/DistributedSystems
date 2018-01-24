import java.rmi.*;

public interface Fibonacci extends java.rmi.Remote {
	
	/**
	* returns the nth fibonacci number where n is the input
	**/
	public int fib(int n) throws RemoteException;

}