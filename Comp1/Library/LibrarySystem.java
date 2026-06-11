package Library;

import java.util.ArrayList;

public class LibrarySystem 
{
    public void returnBook(User user, Book book)
    {
        if (user.getBorrowedBooks().contains(book))
        {
            user.getBorrowedBooks().remove(book);
            book.setIsBorrowed(false);
            System.out.println("成功归还图书");
        }
        else
        {
            System.out.println("该书未被借阅");
        }
    }

    private ArrayList<User> userList = new ArrayList<>();

    public void registerUser(String userId, String name, ArrayList<Book> borrowedBooks)
    {
        User newUser = new User(userId, name, borrowedBooks);
        userList.add(newUser);
        System.out.println("注册成功！");
    }
}
