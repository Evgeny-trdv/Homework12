public class App {
    public static void main(String[] args) {

        Author authorOne = new Author("Jack", "London");
        Author authorTwo = new Author("Andrzei ", "Sapkowski");
        Book bookOne = new Book ("Matrin Iden", authorOne, 1914);
        Book bookTwo = new Book("Witcher", authorTwo, 1980);

        System.out.println("authorOne.getFirstName() = " + authorOne.getFirstName());
        System.out.println("bookOne.getAuthor().firstName = " + bookOne.getAuthor().getFirstName());
        System.out.println("bookOne.getYearOfPublication() = " + bookOne.getYearOfPublication());
        bookOne.setYearOfPublication(1920);
        System.out.println("bookOne.getYearOfPublication() = " + bookOne.getYearOfPublication());

    }
}