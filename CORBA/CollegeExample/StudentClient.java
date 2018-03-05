import College.*;
import org.omg.CORBA.*;
import java.io.*;
import java.net.*;

public class StudentClient{
  static String stringifiedObjectReference;

  public static void main(String args[]){
    try{
      // create and initialize the ORB
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

        System.out.println("ORB initialized + " + args.length);
        
      //Get and convert the stringified object reference
      // to a generic CORBA object reference
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("IOR")) ;
        System.out.println("File initialized");
        String ior = (String) in.readObject() ;
        System.out.println("IOR file read :  " + ior + "enter");
        in.close() ;
        System.out.println("Close file");

        org.omg.CORBA.Object genericObjRef ;
//        org.omg.CORBA.Object test;
        System.out.println("Generic Object Created");
        
        genericObjRef = orb.string_to_object(ior) ;

      //Cast, or narrow the generic object reference to a
      // true object reference.
       StudentSearch remoteObjRef = StudentSearchHelper.narrow(genericObjRef);
      
      StudentHolder holder = new StudentHolder();
      holder.value = new Student();
	  
      remoteObjRef.searchByRef(holder);
      System.out.println(holder.value);

      //Delay program termination so that the console
      // won't disappear from the screen when running
      // under control of a batch file.
         }catch (Exception e) {
      System.out.println("ERROR : " + e) ;
      e.printStackTrace(System.out);
    }//end catch block
  }//end main() method

}//end DateClient class
