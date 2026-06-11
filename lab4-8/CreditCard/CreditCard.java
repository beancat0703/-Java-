public class CreditCard extends PaymentMethod implements Payable
{
    private String cardNumber;
    private String expireDate;

    public CreditCard(String ownerName, double balance, String currency, String cardNumber, String expireDate)
    {
        super(ownerName, balance, currency);
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
    }

    @Override
    public boolean validate()
    {
        return balance > 0;
    }

    @Override
    public void pay(double amount)
    {
        if ((validate() == true) && (balance >= amount))
        {
            balance -= amount;
            System.out.println("Paid " + amount + " " + currency + " using card ending with " + cardNumber.substring(cardNumber.length() - 4));
        }
        else
        {
            System.out.println("Failed");
        }
    }

    @Override
    public String getTransactionInfo()
    {
        String lastFour = cardNumber.substring(cardNumber.length() - 4);
        return "Card **** " + lastFour + " paid 100.0 " + currency;
    }

    public void deductAnnualFee(double fee)
    {
        balance -= fee;
    }
}
