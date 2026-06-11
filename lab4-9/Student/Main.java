public class Main 
{
    public static void main(String[] args)
    {
        Student student = new Student("王五", "S001");
        Student.Score score = student.new Score(85, 90, 88);

        student.printInfo();
        System.out.printf("总分：%.2f\n", score.getTotal());
        System.out.printf("平均分：%.2f\n", score.getAverage());
    }
}
