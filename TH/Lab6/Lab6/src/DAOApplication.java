import java.util.List;
public class DAOApplication {
     private static BookDao bookDao;
     public static void main(String[] args) {
		bookDao= new BookDaolmpl();
		bookDao.updateBook(new Book("Lập trình web",1));
		bookDao.deleteBook(new Book("Lập trình web",2));
		List<Book>books= bookDao.getAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
		
	}
}
