import java.util.List;
public interface BookDao {
    public List<Book> getAllBooks();
    public Book getBook(int idBook);
    public void updateBook(Book book);
    public void deleteBook(Book book);
   
}
