public class Student 
{
    private String name;
    private String id;
    private double score;

    public Student(String name, String id, double score)
    {
        this.name = name;
        this.id = id;
        this.setScore(score);
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public double getScore()
    {
        return score;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setScore(double score)
    {
        if(score >= 0 && score <= 100)
        {
            this.score = score;
        }
        else
        {
            this.score = 0;
        }
    }

    public String getGrade()
    {
        if(score >= 90 && score <= 100)
        {
            return "A";
        }
        else if(score >= 80 && score <= 89)
        {
            return "B";
        }
        else if(score >= 70 && score <= 79)
        {
            return "C";
        }
        else if(score >= 60 && score <= 69)
        {
            return "D";
        }
        else
        {
            return "E";
        }
    }

    public void displayInfo()
    {
        System.out.println("姓名：" + getName());
        System.out.println("学号：" + getId());
        System.out.println("成绩：" + getScore());
        System.out.println("等第：" + getGrade());
    }
}

class StudentTest
{
    public static void main(String[] args)
    {
        Student stu1 = new Student("张三", "2026001", 85.5);
        Student stu2 = new Student("李四", "2026002", 105);
        stu1.displayInfo();
        stu2.displayInfo();
        stu2.setScore(92);
        stu2.displayInfo();
    }
}