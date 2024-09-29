public class App {
    public static void main(String[] args) {

        Author authorOne = new Author("Jack", "London");
        Author authorTwo = new Author("Andrzei ", "Sapkowski");
        Author authorThree = new Author("Jack", "London");
        Book bookOne = new Book ("Matrin Iden", authorOne, 1914);
        Book bookTwo = new Book("Witcher", authorTwo, 1980);

        System.out.println("authorOne.getFirstName() = " + authorOne.getFirstName());
        System.out.println("bookOne.getAuthor().firstName = " + bookOne.getAuthor().getFirstName());
        System.out.println("bookOne.getYearOfPublication() = " + bookOne.getYearOfPublication());
        bookOne.setYearOfPublication(1920);
        System.out.println("bookOne.getYearOfPublication() = " + bookOne.getYearOfPublication());

        // Реализуйте методы
        //toString
        //,
        //equals
        // и
        //hashCode
        // в классах
        //Author
        // и
        //Book
        //, которые вы создали на прошлом уроке.
        //
        //Обратите внимание, что
        //toString
        // книги не должен дублировать код из
        //toString
        // автора, а должен делегировать (вызывать) его версию метода.

        System.out.println(authorOne.toString());
        System.out.println(bookOne.toString());

        System.out.println(authorOne.hashCode());
        System.out.println(authorTwo.hashCode());
        System.out.println(authorThree.hashCode());

        System.out.println(authorOne.equals(authorTwo));
        System.out.println(authorOne.equals(authorThree));

        System.out.println(bookOne.equals(bookTwo));
    }
}