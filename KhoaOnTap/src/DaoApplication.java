	import java.util.List;
	import java.util.Vector;

	class Book {
	private int Bookid;
	private String name;
	public Book(int bookid, String name){
		this.Bookid=bookid;
		this.name=name;
	}
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid){
		this.Bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	}

	interface BookDao{
		public List<Book>getAllBooks();
		public Book getBook(int Bookid);
		public void updateBook(Book book);
		public void deleteBook(Book book);
	}
	class BookDaolmpl implements BookDao{
	private List<Book> books = new Vector<Book>();
	public BookDaolmpl() {
		books.add(new Book(1,"Lap trinh web"));
		books.add(new Book(2,"OOP"));
	}
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public Book getBook(int Bookid) {
		// TODO Auto-generated method stub
			for (Book book : books) {
			if(book.getBookid()==Bookid) {
				return book;
			}
		
		}
		return null;
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
			Book b=getBook(book.getBookid());
			if(b!=null)
				b.setName(book.getName());
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
			Book b=getBook(book.getBookid());
			if(b!=null)
				books.remove(b);
	}
		
	}

	public class DaoApplication {
	public static BookDao bookDao;
	public static void main(String[] args) {
		bookDao = new BookDaolmpl();
		bookDao.updateBook(new Book(1,"Lập trình đối tượng"));
		bookDao.deleteBook(new Book(1, "Lập trình đối tượng"));
		List<Book>books =bookDao.getAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
	}

	}
