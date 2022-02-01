import java.util.ArrayList;

public class Library {
    private ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public boolean doesBookHaveSameNumber(Book bookISBNNumber){
        for (Book book : listOfBooks) {
            if (book.getISBNNumber() == bookISBNNumber.getISBNNumber()){
                System.out.println("There is a book with same number");
                return true;
            }
        }
        System.out.println("There isn't a book with same number");
        return false;

    }

        public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1123, "Book 1", 1995);
        Book book2 = new Book(3765, "Book 2", 2010);
        Book book3 = new Book(8796, "Book 3", 1999);

        library.listOfBooks.add(book1);
        library.listOfBooks.add(book2);
        library.listOfBooks.add(book3);


        Book test = new Book(13343, "Book 4", 2007);

        System.out.println(library.doesBookHaveSameNumber(test));

        }
    }


