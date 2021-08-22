public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("12345",200.5,"defaultName","defaultEmail","defaultNumber");
        System.out.println("Empty constructor");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",1000.0,customerName,customerEmailAddress,customerPhoneNumber);
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account is opened");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit is "+depositAmount+" Amount. Now is current balance "+this.balance);
    }

    public  void withdraw(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Amount "+this.balance+" only. So withdrawal not process");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal is "+withdrawalAmount+" Amount. Now is current balance is "+this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
