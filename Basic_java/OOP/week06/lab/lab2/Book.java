package week06.lab.lab2;

public class Book {
    private String bookName;
    private String bookID;
    private int bookPrice;

    public Book(String bookName, String bookID, int bookPrice){

    }
    
    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookID(){
        return bookID;
    }

    public void setBookID(String bookID){
        this.bookID = bookID;
    }

    public int getBookPrice(){
        return bookPrice;
    }

    public void setBookPrice(int bookPrice){
        this.bookPrice = bookPrice;
    }
}
