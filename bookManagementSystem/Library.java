package bookManagementSystem;

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
            if(obj!=null){
                System.out.println(obj.toString());
            }else{
                System.out.println("Book is removed by management");
            }

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
        for(Book obj: this.books){
            if(obj.getBookID() == bookId){
                obj.setBookID(bookId);
                obj.setAuthor(book.getAuthor());
                obj.setTitle(book.getTitle());
                obj.setAvailable(book.isAvailable());
            }
        }
        System.out.println("Book replaced successfully");
    }

    public void removeBook(int bookId){
        int index=0;
        for(Book obj: this.books){
            if(obj.getBookID() == bookId){
                this.books[index] = null;
            }
            index++;
        }
        System.out.println("Book removed");
    }
}
