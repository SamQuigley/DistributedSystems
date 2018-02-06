package College;


/**
* College/_StudentSearchImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from college.idl
* 05 February 2018 13:03:16 o'clock GMT
*/

public abstract class _StudentSearchImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements College.StudentSearch, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _StudentSearchImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("search", new java.lang.Integer (0));
    _methods.put ("searchByRef", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // College/StudentSearch/search
       {
         int id = in.read_long ();
         College.Student $result = null;
         $result = this.search (id);
         out = $rh.createReply();
         College.StudentHelper.write (out, $result);
         break;
       }

       case 1:  // College/StudentSearch/searchByRef
       {
         College.StudentHolder student = new College.StudentHolder ();
         this.searchByRef (student);
         out = $rh.createReply();
         College.StudentHelper.write (out, student.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:College/StudentSearch:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _StudentSearchImplBase
