import BookShop.*;
import org.omg.CORBA.*;
import BookShop.Book;
import java.util.Date;
import java.io.*;
import java.net.*;

class BookSearchServant extends _BookSearchImplBase{
	public Book search(int id){

		return new Book(1,"Harry Potter", "Dity Michael", "2014");
  }
  
  
  public void searchByRef(BookHolder holder){
	  
	  Book b = new Book();
	  b.title = "Fifty Shades of CORBA";
	  b.author = "Dirty Michael";
	  b.release = "2018";
	  b.id = 1;
	  
	  holder.value = b;
  }
}