package Library;

public class Book
{
    private String bookTitle;
    private String author;
    private String bookId;
    private boolean isBorrowed;

    public Book(String bookTitile, String author, String bookId, boolean isBorrowed)
    {
        this.bookTitle = bookTitile;
        this.author = author;
        this.bookId = bookId;
        this.isBorrowed = false;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getBookId()
    {
        return bookId;
    }

    public void setBookId(String bookId)
    {
        this.bookId = bookId;
    }

    public boolean getIsBorrowed()
    {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed)
    {
        this.isBorrowed = isBorrowed;
    }

    public void showInfo() 
    {    
        String status = isBorrowed ? "已借出" : "在馆";
        System.out.println("编号: " + bookId + " | 书名: 《" + bookTitle + "》 | 作者: " + author + " | 状态: " + status);
    }
}
