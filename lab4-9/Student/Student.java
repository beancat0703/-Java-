public class Student
{
    private String name;
    private String studentId;

    public Student(String name, String studentId)
    {
        this.name = name;
        this.studentId = studentId;
    }

    public class Score
    {
        private double chinese;
        private double math;
        private double english;

        public Score(double chinese, double math, double english)
        {
            this.chinese = chinese;
            this.math = math;
            this.english = english;
        }

        public double getTotal()
        {
            return chinese + math + english;
        }

        public double getAverage()
        {
            return getTotal() / 3;
        }
    }

    public void printInfo()
    {
        System.out.printf("学生姓名：%s\n", name);
        System.out.printf("学号：%s\n", studentId);
    }
}