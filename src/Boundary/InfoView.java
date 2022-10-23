package Boundary;

import Entity.BankAccount;
import Entity.Customer;

import java.util.ArrayList;

public  class InfoView {
    public static void printCustomer(ArrayList<Customer> customers){
        for (Customer customer:customers
             ) {
            System.out.println(customer);
        }
    }
    public static void printBAnkAccount(ArrayList<BankAccount> bankAccounts){
        for (BankAccount bankAccount:bankAccounts
             ) {
            System.out.println(bankAccount);
        }

    }

}
