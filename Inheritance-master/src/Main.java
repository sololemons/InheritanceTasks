class bankAccount
{
    int accountNo;
    String accountName, acPhone, accountEmail;
    double AccountBalance;
    public bankAccount(int accountNo, String accountName, String acPhone, String acEmail, double acBal)
    {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.acPhone = acPhone;
        this.accountEmail = acEmail;
        this.AccountBalance = acBal;
    }
    public void accountHolder()
    {
        System.out.println("Account Number :" + accountNo);
        System.out.println("Account Holder Name :" + accountName);
        System.out.println("Account Holder Address :" + acPhone);
        System.out.println("Account Holder Phone :" + accountEmail);
        System.out.println("Account Holder Balance :" + AccountBalance);
    }
    public void deposit(double amount)
    {
        AccountBalance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void displayBalance()
    {
        System.out.println("Account Number: " + accountNo + "\tBalance: $" + AccountBalance);
    }
}

class SavingsAccount extends bankAccount
{
    public SavingsAccount(int acNo, String acName, String acPhone, String acEmail, double acBal)
    {
        super(acNo, acName, acPhone, acEmail, acBal);
    }
}

class CurrentAccount extends bankAccount
{
    public CurrentAccount(int acNo, String acName, String acPhone, String acEmail, double acBal)
    {
        super(acNo, acName, acPhone, acEmail, acBal);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("SAVINGS ACCOUNT DETAILS");
        SavingsAccount sac = new SavingsAccount(1001, "Ann Kamau", "07200000", "test@gmail.com", 1000);
        sac.accountHolder();
        sac.deposit(500);
        sac.displayBalance();
        CurrentAccount cac = new CurrentAccount(1001, "Solomon Ndimu", "08100000", "admin@gmail.com", 0.0);
        System.out.println("\nCURRENT BANK ACCOUNT DETAILS");
        cac.accountHolder();
        cac.deposit(300);
        cac.displayBalance();
    }
}