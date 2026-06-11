package Library;

import java.util.ArrayList;

public class User 
{
    private String userId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(String userId, String name, ArrayList<Book> borrowedBooks)
    {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getUserId()
    {
        return userId;
    }

    public String name()
    {
        return name;
    }

    public ArrayList<Book> getBorrowedBooks()
    {
        return borrowedBooks;
    }

    public void showBorrowedBooks()
    {
        System.out.println(name + " 的借阅清单: ");
        for (Book book: borrowedBooks)
        {
            book.showInfo();
        }
    }
}
