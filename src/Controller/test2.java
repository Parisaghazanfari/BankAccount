package Controller;

import Boundary.InfoView;
import Entity.AccountType;
import Entity.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        BankAccount bankAccount = new BankAccount();
            Scanner sc = new Scanner(System.in);
            System.out.println("Customer Initial Amount:");
            bankAccount.setInitialAmount(sc.nextInt());
       while (bankAccount.getInitialAmount() < 100000) {
            System.out.println("Increase your initial amount to 100000");
            bankAccount.setInitialAmount(sc.nextInt());
        }
           // System.out.println("Customer Account Type:");
            //bankAccount.setAccountType(AccountType.loanAccount);
            System.out.println("Customer Cart Number:");
            bankAccount.setCartNumber(sc.next());
            System.out.println("Customer Account Number:");
            bankAccount.setAccountNumber(sc.next());
            System.out.println("Customer Sheba Number:");
            System.out.print("IR-");
            bankAccount.setShebaNumber(sc.next());
            System.out.println("Customer cvv2:");
            bankAccount.setCvv2(sc.nextInt());
            System.out.println("Customer Expire Month");
            bankAccount.setExpireMonth(sc.nextInt());
            System.out.println("Customer Expire Year:");
            bankAccount.setExpireYear(sc.nextInt());
            System.out.println("Bank Branch Name" +"\n" +bankAccount.getBranchName());
            System.out.println("Bank Branch Code" +"\n" + bankAccount.getBranchCode());
            bankAccounts.add(bankAccount);

             BankAccount bankAccount2 = new BankAccount();
             Scanner sc2 = new Scanner(System.in);
            System.out.println("Customer Initial Amount:");
            bankAccount2.setInitialAmount(sc2.nextInt());
        while (bankAccount.getInitialAmount() < 100000) {
            System.out.println("Increase your initial amount to 100000");
            bankAccount2.setInitialAmount(sc.nextInt());
        }
        System.out.println("Customer Account Type:");
        //bankAccount.setAccountType(AccountType.loanAccount);
        //System.out.println("Customer Cart Number:");
        bankAccount2.setCartNumber(sc2.next());
        System.out.println("Customer Account Number:");
        bankAccount2.setAccountNumber(sc2.next());
        System.out.println("Customer Sheba Number:" +"IR-");
        bankAccount2.setShebaNumber(sc2.next());
        System.out.println("Customer cvv2:");
        bankAccount2.setCvv2(sc2.nextInt());
        System.out.println("Customer Expire Month");
        bankAccount2.setExpireMonth(sc2.nextInt());
        System.out.println("Customer Expire Year:");
        bankAccount2.setExpireYear(sc2.nextInt());
        System.out.println("Bank Branch Name" +"\n" +bankAccount2.getBranchName());
        System.out.println("Bank Branch Code" +"\n" + bankAccount2.getBranchCode());
        bankAccounts.add(bankAccount2);
        InfoView.printBAnkAccount(bankAccounts);

    }
}