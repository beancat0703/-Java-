class Book
{
    private String bookName;
    private String pressName;
    private String author;
    private double price;

    public Book(String bookName, String pressName, String author, double price)
    {
        this.bookName = bookName;
        this.pressName = pressName;
        this.author = author;
        this.price = price;
    }

    public void showInfo()
    {
        System.out.println("书名：" + bookName);
        System.out.println("出版社：" + pressName);
        System.out.println("作者：" + author);
        System.out.println("价格：" + price);
    }
}

class Teacher
{
    private String subject;
    private String classString;
    private String name;
    private String gender;

    public Teacher(String subject, String classString, String name, String gender)
    {
        this.subject = subject;
        this.classString = classString;
        this.name = name;
        this.gender = gender;
    }

    public void showInfo()
    {
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("班级：" + classString);
        System.out.println("所代课程名：" + subject);
    }

    public void searchBook(Book book)
    {
        book.showInfo();
    }

    public void searchStudent(Student student)
    {
        student.showInfo();
    }
}

class Student
{
    private String number;
    private String classString;
    private String name;
    private String gender;

    public Student(String number, String classString, String name, String gender)
    {
        this.number= number;
        this.classString = classString;
        this.name = name;
        this.gender = gender;
    }

    public void showInfo()
    {
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("班级：" + classString);
        System.out.println("学号：" + number);
    }

    public void searchBook(Book book)
    {
        book.showInfo();
    }

    public void searchTeacher(Teacher teacher)
    {
        teacher.showInfo();
    }
}

public class GetInfo 
{
    public static void main(String[] args)
    {
        Book book = new Book("离散数学", "清华大学出版社", "王老师", 49.99);
        Teacher teacher = new Teacher("高等数学", "2025051", "王老师", "男");
        Student student = new Student("20251916", "2025051", "张同学", "男");
        System.out.println("\n测试老师查询书籍和学生");
        teacher.searchBook(book);
        System.out.println();
        teacher.searchStudent(student);
        System.out.println("\n测试学生查询书籍和老师");
        student.searchBook(book);
        System.out.println();
        student.searchTeacher(teacher);
    }
}