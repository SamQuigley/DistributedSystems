package College;

/**
* College/StudentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from college.idl
* 05 February 2018 13:03:16 o'clock GMT
*/

public final class StudentHolder implements org.omg.CORBA.portable.Streamable
{
  public College.Student value = null;

  public StudentHolder ()
  {
  }

  public StudentHolder (College.Student initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = College.StudentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    College.StudentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return College.StudentHelper.type ();
  }

}
