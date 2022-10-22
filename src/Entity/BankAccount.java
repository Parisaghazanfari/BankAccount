package Entity;

public class BankAccount {
   public String cartNumber;
   public String accountNumber;
   public  String shebaNumber;
   public int cvv2;
   int expireMonth;
   int expireYear;
   final String branchName="Tehran";
   final int branchCode=123;

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
}
