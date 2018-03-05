import College.*;
import org.omg.CORBA.*;
import java.util.Date;
import java.io.*;
import java.net.*;

class StudentSearchServant extends _StudentSearchImplBase{
	public Student search(int id){

		return new Student("John", 10, "john@gmail.com", id);
  }
  
  
  public void searchByRef(StudentHolder holder){
	  
	  Student a = new Student();
	  a.name = "John";
	  a.age = 100;
	  a.email = "jeremy@gmail.com";
	  a.id = 12;
	  
	  holder.value = a;
  }
}