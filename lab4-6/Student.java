public class Student
{
    private String name;
    String studentId;
    protected int score;
    public String className;

    public Student(String name, String studentId, int score, String className)
    {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
        this.className = className;
    }

    public boolean isFirstNameCapital()
    {
        return Character.isUpperCase(name.charAt(0));
    }

    public void printInfo()
    {
        System.out.println("学生姓名：" + name);
        System.out.println("学号：" + studentId);
        System.out.println("分数：" + score);
        System.out.println("班级名称：" + className);
    }

    public String getName()
    {
        return name;
    }
}