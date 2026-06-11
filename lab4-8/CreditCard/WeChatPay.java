public class WeChatPay extends PaymentMethod implements Payable
{
    private String openId;
    private double dailyLimit;
    private double todaySpent;

    public WeChatPay(String ownerName, double balance, String currency, String openId, double dailyLimit, double todaySpent)
    {
        super(ownerName, balance, currency);
        this.openId = openId;
        this.dailyLimit = dailyLimit;
        this.todaySpent = todaySpent;
    }

    @Override
    public boolean validate()
    {
        return todaySpent < dailyLimit;
    }

    @Override
    public void pay(double amount)
    {
        if ((validate() == true) && (balance >= amount) && ((todaySpent + amount) <= dailyLimit))
        {
            balance -= amount;
            todaySpent += amount;
            System.out.println("Paid " + amount + " " + currency + " via WeChat " + "(OpenID: " + openId + ")");
        }
        else
        {
            System.out.println("Failed");
        }
    }

    @Override
    public String getTransactionInfo()
    {
        return "Transaction: OpenID " + openId + " paid 100.0 " + currency;
    }

    public void resetDailySpent()
    {
        todaySpent = 0;
    }

    
}
