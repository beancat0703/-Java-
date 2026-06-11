public class TestStudent 
{
    public static void main(String[] args)
    {
        Student stu[] = new Student[5];
        stu[0] = new Student("Alice", "S001", 7, "CS_01");
        stu[1] = new Student("bob", "S002", 8, "CS_01");
        stu[2] = new Student("Charlie", "S003", 15, "CS_02");
        stu[3] = new Student("david", "S004", 31, "CS_02");
        stu[4] = new Student("Eve", "S005", 16, "CS_01");

        int count = 0;
        Student theStu = new Student(null, null, count, null);
        int count_1 = 0;
        for (Student b: stu)
        {
            if (b.isFirstNameCapital() == true)
            {
                count ++;
            }
            String ScoreBinary = Integer.toBinaryString(b.score);
            int count_1_compare = 0;
            for (char c: ScoreBinary.toCharArray())
            {
                if (c == '1')
                {
                    count_1_compare ++;
                }
            }
            if (count_1_compare > count_1)
            {
                theStu = b;
                count_1 = count_1_compare;
            }
        }

        System.out.println("姓名首字母大写的人数：" + count);
        System.out.println("\"1\"的个数最多的学生：");
        theStu.printInfo();
    }
}
