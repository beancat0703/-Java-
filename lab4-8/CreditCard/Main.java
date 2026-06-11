public class Main 
{
    public static void main(String[] args)
    {
        PaymentMethod[] methods = new PaymentMethod[2];
        methods[0] = new CreditCard("User1", 500, "CNY", "123456789", "2040.10.1");
        methods[1] = new WeChatPay("user2", 300, "CNY", "wx_abc123", 500, 100);

        for (PaymentMethod m: methods)
        {
            if (m instanceof CreditCard)
            {
                System.out.println("--- Credit Card ---");
                if (m.validate())
                {
                    System.out.println("Card validated: true");
                    ((CreditCard)m).pay(100);
                    m.showBalance();
                    System.out.println(((CreditCard)m).getTransactionInfo());
                    System.out.println();
                }
            }
            else if (m instanceof WeChatPay)
            {
                System.out.println("--- WeChat Pay ---");
                if (m.validate())
                {
                    System.out.println("WeChat validated: true");
                    ((WeChatPay)m).pay(100);
                    m.showBalance();
                    System.out.println((((WeChatPay)m).getTransactionInfo()));
                    System.out.println();
                }   
            }
        }

        ((CreditCard)methods[0]).deductAnnualFee(50);
        System.out.println("After annual fee deduction: ");
        methods[0].showBalance();

        ((WeChatPay)methods[1]).resetDailySpent();
        ((WeChatPay)methods[1]).pay(100);
        System.out.println("Paid 100.0 CNY again, balance: " + methods[1].balance);
    }
}
