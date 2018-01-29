import HelloApp.*;
import java.util.Random;

//servant must inherit the generated code
public class HelloServant extends _HelloImplBase{

    //add the say hello method ..

    public String sayHello (){
         //add method implementation..
        final String[] msg = {"WORKING", "CORBA CONNECTED", "YAS, IT WORKS!", "random msg of completion", "coffee time"};
        Random random = new Random();  
        int index = random.nextInt(msg.length);  
        return msg[index];
    }
}