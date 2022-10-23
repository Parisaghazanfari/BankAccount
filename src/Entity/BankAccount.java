package Entity;

public class BankAccount {
   private String cartNumber;
    private String accountNumber;
    private  String shebaNumber;
    private int cvv2;
    private int expireMonth;
    private int expireYear;
    private double initialAmount;
   final String branchName="Tehran";
   final int branchCode=123;

    private AccountType accountType;



    public BankAccount() {
    }


    public BankAccount(String cartNumber, String accountNumber, String shebaNumber, int cvv2, int expireMonth, int expireYear) {
        this.cartNumber = cartNumber;
        this.accountNumber = accountNumber;
        this.shebaNumber = shebaNumber;
        this.cvv2 = cvv2;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public String getShebaNumber() {
        return shebaNumber;
    }

    public int getCvv2() {
        return cvv2;
    }

    public int getExpireMonth() {
        return expireMonth;
    }

    public int getExpireYear() {
        return expireYear;
    }

    public String getBranchName() {
        return branchName;
    }

    public int getBranchCode() {
        return branchCode;
    }
    public double getInitialAmount() {
        return initialAmount;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setShebaNumber(String shebaNumber) {
        this.shebaNumber = shebaNumber;
    }

    public void setCvv2(int cvv2) {
        this.cvv2 = cvv2;
    }

    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }

    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "cartNumber='" + cartNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", shebaNumber='" + shebaNumber + '\'' +
                ", cvv2=" + cvv2 +
                ", expireMonth=" + expireMonth +
                ", expireYear=" + expireYear +
                ", initialAmount=" + initialAmount +
                ", branchName='" + branchName + '\'' +
                ", branchCode=" + branchCode +
                ", accountType=" + accountType +
                '}';
    }
}
