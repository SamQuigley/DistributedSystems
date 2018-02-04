import DateApp.*;
import java.util.Date;

//servant must inherit the generated code
public class DateServant extends _DateImplBase{

    //add the say hello method ..

    public String getDate (){
         //add method implementation..
        Date date = new Date();
        return date.toString();
    }
}