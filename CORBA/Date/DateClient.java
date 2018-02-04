import DateApp.*; //import generated files from idl
import org.omg.CORBA.*; //all of the corba package
import java.io.*;

public class DateClient{
//add the main method here...
    public static void main (String args[]){
        //try catch block here
        // read obj reference of the HelloStringifiedClient code
        try{
            //initilize the orb
            ORB orb = ORB.init(args, null);
            //read obj ref for the hello servant 
            BufferedReader br = new BufferedReader(new FileReader("dateIOR"));
            String ior = br.readLine();
            //convert the string object reference to an object
            org.omg.CORBA.Object obj = orb.string_to_object(ior);
            //convert the object to the correct type i.e hello
            Date dateRef = DateHelper.narrow(obj);
            //call operation on the servant
            String date = dateRef.getDate();
            System.out.println(date);
        }catch(Exception e){
            System.out.print("ERROR: "+ e);
            e.printStackTrace(System.out);
        } 
    }
}
