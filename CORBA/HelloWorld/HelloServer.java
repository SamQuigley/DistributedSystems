//package containing our stubs
import HelloApp.*;
//ALL CORBA applications need these classes
import org.omg.CORBA.*;
//needed for output to the file system
import java.io.*;

public class HelloServer{
    public static void main (String args[]){

        try{
            //initilize the ORB
            ORB orb = ORB.init(args, null);
            //instantiate the helloservant on the server
            HelloServant helloRef = new HelloServant();
            //connect the HelloServant to the ORB
            orb.connect(helloRef);
            //store an object reference to the helloservant to a string format
            String ior = orb.object_to_string(helloRef);
            //write object reference to the helloservant to a file called HelloIOR
            FileOutputStream fos = new FileOutputStream("HelloIOR");
            PrintStream ps = new PrintStream(fos);
            ps.print(ior);
            ps.close();
            //run the orb, so it waits on the client..
            orb.run();
        }catch(Exception e){
            System.out.print("ERROR: "+ e);
            e.printStackTrace(System.out);

        } 
    }
}
