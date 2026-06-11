public class BankAccount
{
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.owner = owner;
        if (initialBalance < 0)
        {
            this.balance = 0;
        }
        else
        {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount;
            System.out.printf("成功存入%.2f元\n", amount);
            System.out.printf("存入后余额为%.2f元\n", this.balance);
        }
        else
        {
            System.out.printf("存款必须大于0元\n");
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= this.balance)
        {
            this.balance -= amount;
            System.out.printf("成功取出%.2f元\n", amount);
            System.out.printf("取款后余额为%.2f元\n", this.balance);
        }
        else
        {
            if(amount <= 0)
            {
                System.out.printf("取款必须大于0\n");
            }
            else
            {
                System.out.printf("取款必须小于余额\n");
            }
        }
    }

    public double getBalance()
    {
        System.out.printf("余额为%.2f\n", this.balance);
        return balance;
    }

    public void display()
    {
        System.out.printf("账号：%s\n", this.accountNumber);
        System.out.printf("户名：%s\n", this.owner);
        System.out.printf("余额：%.2f\n", this.balance);
    }
    
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }
}

class TestBankAccount
{
    public static void main(String[] args)
    {
        System.out.println("\n测试开户");
        BankAccount acc = new BankAccount("张三", "202601", 500);
        acc.display();
        System.out.println("\n测试存款");
        acc.deposit(1000);
        System.out.println("\n测试取款");
        acc.withdraw(300);
        System.out.println("\n测试非法取款");
        acc.withdraw(3000);
        System.out.println("\n测试非法存款");
        acc.deposit(-100);
    }
}