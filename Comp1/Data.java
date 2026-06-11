import java.util.Scanner;

class Today
{
    private static final int[] MONTH_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int year;
    private int month;
    private int day;

    public Today(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int calculateDays()
    {
        int totalDays = 0;

        for (int i = 0; i < month; i ++)
            if (i == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
            {
                totalDays += 29;
            }
            else
            {
                totalDays += MONTH_DAYS[i];
            }
        totalDays += day;
        return totalDays;
    }


}


public class Data 
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入年月日");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        Today date = new Today(year, month, day);
        int result = date.calculateDays();
        System.out.printf("这是%d年的第%d天\n", year, result);

        sc.close();
    }
}
