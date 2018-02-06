/*
This is a Java/CORBA server that illustrates the use
of stringified object references stored in a file on
a server that is different from the machine on which
either the CORBA server or the CORBA client are located.

This server provides a servant object that returns the
date and time as a string. */

import College.*;
import org.omg.CORBA.*;
import java.util.Date;
import java.io.*;
import java.net.*;

public class StudentSearchServer   {
	static String stringifiedObjectReference;

  public static void main(String args[]){
    try{
      //Create and initialize the ORB
      ORB orb = ORB.init(args, null);

      //Create servant and register it with the ORB
      StudentSearchServant ssObjectReference = new StudentSearchServant();
      orb.connect(ssObjectReference);

      //Convert the object reference to a string and store
      // it in a common file for access by the client.
      orb.object_to_string(ssObjectReference);
      // System.out.println(dateObjectReference +);

     	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("IOR")) ;

        out.writeObject(orb.object_to_string(ssObjectReference)) ;
        out.close() ;
        System.out.println("Server is running");
        orb.run();
    }catch (Exception e) {
       System.err.println("ERROR: " + e);
       e.printStackTrace(System.out);
    }//end catch block
  }//end main()
}
