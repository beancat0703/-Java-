public class Book
{
    private String bookId;
    String title;
    protected double price;
    public String publisher;

    public Book(String bookId, String title, double price, String publisher)
    {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    public void printInfo()
    {
        System.out.println("书籍编号：" + bookId);
        System.out.println("书名：" + title);
        System.out.println("价格：" + price);
        System.out.println("出版社：" + publisher);
    }

    public static void sortByPrice(Book[] books)
    {
        for (int i = 0; i < books.length - 1; i++)
        {
            for (int j = 0; j < books.length - 1 - i; j++)
            {
                if (books[j].price > books[j + 1].price)
                {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public String getBookId()
    {
        return bookId;
    }
}