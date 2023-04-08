import java.util.List;
import java.util.Vector;

public class BookDaolmpl implements BookDao {
    private List<Book> books = new Vector<Book>();
    public BookDaolmpl () {
    	books.add(new Book("Kĩ thuật lập Trinh",1));
    	books.add(new Book ("Phương pháp lập trình hướng đối tượng",2));
    }
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public Book getBook(int idBook) {
		// TODO Auto-generated method stub
		for (Book book : books) {
			if(book.getIdBook()==idBook) {
				return book;
			}
		}
		return null;
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		Book b =getBook(book.getIdBook());
		if(b!=null) {
			b.setName(book.getName());
		}
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		Book b =getBook(book.getIdBook());
		if(b!=null) {
			books.remove(b);
		}
	}
    
}
