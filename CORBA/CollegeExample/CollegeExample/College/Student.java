package College;


/**
* College/Student.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from college.idl
* 05 February 2018 13:03:16 o'clock GMT
*/

public final class Student implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public int age = (int)0;
  public String email = null;
  public int id = (int)0;

  public Student ()
  {
  } // ctor

  public Student (String _name, int _age, String _email, int _id)
  {
    name = _name;
    age = _age;
    email = _email;
    id = _id;
  } // ctor
  
  public String toString(){
	  return "Name: " + name;
  }

} // class Student
