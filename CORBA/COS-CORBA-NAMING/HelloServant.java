import HelloNaming.*;

class HelloServant extends _HelloImplBase
{
    public String sayHello()
    {
		System.out.println("Received a call.");
		return "\nHello world !!\n";
    }
}
