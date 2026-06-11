public class BookTest 
{
    public static void main(String[] args)
    {
        Book[] books = new Book[4];
        books[0] = new Book("B003", "Java Programming", 59.8, "人民邮电出版社");
        books[1] = new Book("B001", "Python Basics", 45.5, "机械工业出版社");
        books[2] = new Book("B004", "C++ Primer", 79.9, "电子工业出版社");
        books[3] = new Book("B002", "Data Structures", 68.0, "清华大学出版社");

        System.out.println("\n--- 提取编号数字与统计大写字母 ---");
        for (Book b: books)
        {
            String idStr = b.getBookId().substring(1);
            int idInt = Integer.parseInt(idStr);
            int count = 0;
            for (char c: b.title.toCharArray())
            {
                if (Character.isUpperCase(c))
                {
                    count ++;
                }
            }
            System.out.println("提取结果：" + b.getBookId() + " -> " + idInt + "   大写字母个数：" + count);
        }

        System.out.println("\n--- 按价格排序后的书籍信息 ---");
        Book.sortByPrice(books);
        for(Book b: books)
        {
            b.printInfo();
        }
    }
}
