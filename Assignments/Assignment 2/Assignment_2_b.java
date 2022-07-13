package com.gecg;

/*
Assignment-2-b:	Create a class Account with two overloaded constructors.
The first constructor is used for initializing, the name of account holder, the
account number and the initial amount in the account. The second constructor is used
for initializing the name of the account and the current balance. The Account class is
having method Deposite(), Withdraw(), and Get_Balance(). take the necessary assumption
for data members and return types of methods. Create objects of Account class and use them.
 */

import java.util.Date;

class account {
    String name, address, type;
    int accno, bal;

    account(String n, int no, int b) {
        name = n;
        accno = no;
        bal = b;
    }

    account(String n, int no, String addr, String t, int b) {
        name = n;
        accno = no;
        address = addr;
        type = t;
        bal = b;
    }

    void deposite(int a) {
        bal += a;
    }

    void withdraw(int a) {
        bal -= a;
    }

    int getbalance() {
        return (bal);
    }

    void show() {
        System.out.println("************************");
        System.out.println(" ACCOUNT DETAILS");
        System.out.println("************************");
        System.out.println("Name : " + name);
        System.out.println("Account No : " + accno);
        System.out.println("Address : " + address);
        System.out.println("Type : " + type);
        System.out.println("Balance : " + bal);
        System.out.println("************************");
    }
}

class Assignment_2_b {
    public static void main(String arg[]) throws Exception {

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Assignment-2-b");
        System.out.println("Aim: Create a class Account with two overloaded constructors.\n" +
                "The first constructor is used for initializing, the name of account holder, the\n" +
                "account number and the initial amount in the account. The second constructor is used\n" +
                "for initializing the name of the account and the current balance. The Account class is\n" +
                "having method Deposite(), Withdraw(), and Get_Balance(). take the necessary assumption\n" +
                "for data members and return types of methods. Create objects of Account class and use them.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();

        account a1 = new account("Suryadip", 7056, 70000);
        account a2 = new account("Jay", 3333, "bhavnagar", "Current account", 20000);
        a1.address = "Kolkata";
        a1.type = "fixed deposite";
        a1.deposite(8000);
        a2.withdraw(5000);
        a2.deposite(1000);
        a1.show();
        a2.show();
    }
}