package Entity;

public enum AccountType {
    loanAccount, savingAccount, longTermAccount, shortTermAccount;
}
/* public enum AccountType {
    loanAccount(0),
    savingAccount(1),
    longTermAccount(2),
    shortTermAccount(3);
private int value;
    AccountType(int value) {
       this.value=value;
    }
    public static AccountType getaccountType(int value) {
        for (AccountType type : AccountType.values()
        ) {
            if (value == type.value) {
                return type;
            }

        }
        return null;
    }
}*/




