public abstract class PaymentMethod
{
    protected String ownerName;
    protected double balance;
    public String currency;

    public PaymentMethod(String ownerName, double balance, String currency)
    {
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
    }

    public abstract boolean validate();

    public void showBalance()
    {
        System.out.println("Remaining Balance: " + balance + " " + currency);
    }
}