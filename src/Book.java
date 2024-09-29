import java.util.Objects;

public class Book {
    private String nameOfBook;
    private Author author;
    private int yearOfPublication;

    public Book(String nameOfBook, Author author, int yearOfPublication) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " + nameOfBook + " , Автор: " + author.toString() + ", год публикации: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(yearOfPublication);
    }
}
