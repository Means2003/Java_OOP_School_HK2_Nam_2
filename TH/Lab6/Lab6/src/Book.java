
public class Book {
   private String name;
   private int idBook;
   public Book (String name, int idBook) {
	   this.name=name;
	   this.idBook=idBook;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getIdBook() {
	return idBook;
   }
   public void setIdBook(int idBook) {
	this.idBook = idBook;
   }
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book["+name+","+name;
	}
   
}
