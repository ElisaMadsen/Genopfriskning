public class Book {
    private int ISBNNumber;
    private String title;
    private int publishedYear;

    public Book (int ISBNNumber, String title, int publishedYear){
        this.ISBNNumber = ISBNNumber;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber=" + ISBNNumber +
                ", title='" + title + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
