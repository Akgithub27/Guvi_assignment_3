package BookManagementSystem;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book firstBook = new Book(1001,"ramayana","valimiki",true);
        Book secondBook = new Book(1002,"half girl friend","chetanbagath",true);
        Book thirdBook = new Book(1003,"rich dad poor dad","robert",true);
        Book fourthBook = new Book(1004,"the time keeper","mitch albom",true);
        Book fifthBook = new Book(1005,"The Psychology of Money","Morgan House",true);
        Book replaceBook = new Book("Ikigai","Francesc Miralles",true);

        library.addBook(firstBook);
        library.addBook(secondBook);
        library.addBook(thirdBook);
        library.addBook(fourthBook);
        library.addBook(fifthBook);


        library.displayAllBooks();

        System.out.println("Book that you searched : "+library.searchBook(1004));

        library.replaceBook(1003,replaceBook);

        library.displayAllBooks();
    }
}
