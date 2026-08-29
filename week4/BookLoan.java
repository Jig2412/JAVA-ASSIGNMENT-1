public class BookLoan {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public BookLoan(String title,String author,String bookCode,boolean loanedStatus){
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        this.loaned = loanedStatus;
    }
    boolean borrowBook(){
        if(!loaned){
            return true;
        }
        return false;
    }
    boolean returnBook(){
        if(loaned){
            return false;
        }
        return true;
    }
    boolean isAvailable(){
        if(loaned == false){
            return true;
        }
        return false;
    }
    @Override
public String toString() {
    return "Book: " + title +
           ", Author: " + author +
           ", Code: " + bookCode +
           ", Loaned: " + loaned;
}
}
