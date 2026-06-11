package Library;

import java.util.ArrayList;

public class LibraryTest 
{
    public static void main(String[] args)
    {
        LibrarySystem library = new LibrarySystem();
        Book book1 = new Book("高等数学", "王老师", "001", true);
        Book book2 = new Book("大学英语", "张老师", "002", true);

        System.out.println("测试图书信息查询：");
        book1.showInfo();

        System.out.println("测试修改图书信息：");
        book2.setAuthor("李老师");
        book2.showInfo();

        System.out.println("测试个人借阅信息查询：");
        ArrayList<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        User user1 = new User("001", "小张", list);
        user1.showBorrowedBooks();

        System.out.println("测试归还书籍：");
        library.returnBook(user1, book1);
    }
}
