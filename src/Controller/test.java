package Controller;

import Boundary.InfoView;
import Entity.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<>();
        Customer customer=new Customer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter your information");
        System.out.println("First Customer Name:");
        customer.setName(sc.next());
        System.out.println("First Customer Last Name:");
        customer.setLastName(sc.next());
        System.out.println("First Customer National Code:");
        customer.setNationalCode(sc.next());
        System.out.println("First Customer Address:");
        customer.setAddress(sc.next());
        System.out.println("First Customer Phone Number:");
        customer.setPhoneNo(sc.next());
        System.out.println("First Customer Post Code:");
        customer.setPostCode(sc.next());
        System.out.println("Thanks");
        customers.add(customer);

        Customer customer2=new Customer();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Second Customer Name:");
        customer2.setName(sc.next());
        System.out.println("Second Customer Last Name:");
        customer2.setLastName(sc.next());
        System.out.println("Second Customer National Code:");
        customer2.setNationalCode(sc.next());
        System.out.println("Second Customer Address:");
        customer2.setAddress(sc.next());
        System.out.println("Second Customer Phone Number:");
        customer2.setPhoneNo(sc.next());
        System.out.println("Second Customer Post Code:");
        customer2.setPostCode(sc.next());
        System.out.println("Thanks");

        customers.add(customer2);
        InfoView.printCustomer(customers);
    }
}
