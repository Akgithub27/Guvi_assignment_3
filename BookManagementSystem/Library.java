package BookManagementSystem;

public class Library {
    Book books[];
    int count=0;

    public Library(){
        this.books = new Book[5];
    }

    public void addBook(Book book){
        if(count<=4){
            this.books[count]=book;
            count++;
        }else{
            System.out.println("Library is full");
        }
    }

    public void displayAllBooks(){
        System.out.println("========================================================================================");
        System.out.println("List of books");
        for(Book obj: this.books){
            System.out.println(obj.toString());
        }
        System.out.println("========================================================================================");
    }

    public String searchBook(int bookID){
        for(Book obj: this.books){
            if(obj.isAvailable() && obj.getBookID() == bookID){
                return obj.toString();
            }
        }
        return "Book is not available or you had entered wrong book ID";
    }

    public void replaceBook(int bookId,Book book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].getBookID() == bookId){
                this.books[i].setBookID(bookId);
                this.books[i].setAuthor(book.getAuthor());
                this.books[i].setTitle(book.getTitle());
                this.books[i].setAvailable(book.isAvailable());
            }
        }
        System.out.println("Book replaced successfully");
    }
}
